 package com.dj.corejava.zk;

import java.security.NoSuchAlgorithmException;

import org.apache.zookeeper.server.auth.DigestAuthenticationProvider;

public class GenerateDigest {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        
        String digest = DigestAuthenticationProvider.generateDigest("super:admin");
        System.out.println("digest="+digest);
    }

}
