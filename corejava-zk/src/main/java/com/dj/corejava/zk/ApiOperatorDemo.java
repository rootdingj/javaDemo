 package com.dj.corejava.zk;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooKeeper.States;
import org.apache.zookeeper.data.Stat;
import org.jboss.netty.util.internal.StringUtil;

/**
 * zk 原生 api 练习
 * @author Steven
 * @date 2020/08/28
 */
public class ApiOperatorDemo {
     
     private final static String CONNECTION_URL = "47.106.125.36:2181";
     private static CountDownLatch countDownLatch = new CountDownLatch(1);
     
     /**
      * 创建zk session连接
      * @throws IOException
      * @throws InterruptedException
      */
     public static ZooKeeper createSession() throws IOException, InterruptedException {
         ZooKeeper zk = new ZooKeeper(CONNECTION_URL, 5000, new Watcher() {
            
            @Override
            public void process(WatchedEvent event) {
              //如果当前的连接状态是连接成功的，那么通过计数器去控制
                if(event.getState()==Event.KeeperState.SyncConnected){
                    countDownLatch.countDown();
                    System.out.println("state:"+event.getState());
                }
            }
        });
        countDownLatch.await();
        System.out.println("创建连接成功，state："+zk.getState());
        return zk;
     }
     
     public static void apiOper(ZooKeeper zk) throws KeeperException, InterruptedException {
         if(zk!=null && States.CONNECTED.equals(zk.getState())) {
             // 创建节点
             String cresult = zk.create("/apiNode", "apiData".getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL);
             System.out.println("创建节点 cresult："+cresult);
             // 修改节点
             Stat stat = zk.setData("/apiNode", "apiData1".getBytes(), -1);
             Thread.sleep(2000);
             System.out.println("修改节点 stat："+stat);
             
             
         }
         
     }
     
     public static void main(String[] args) {
         try {
            ZooKeeper zk = createSession();
            apiOper(zk);
        } catch (IOException e) {
             e.printStackTrace();
        } catch (InterruptedException e) {
             e.printStackTrace();
        } catch (KeeperException e) {
             e.printStackTrace();
        }
    }

}
