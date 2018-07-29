package lx_01;


public class Test_sort {
	
	/**
	 * 冒泡排序：值较小的数逐渐向数组的顶部(即朝第一个元素)冒上来，就像水中的气泡上升一样，同时，值较大的数据逐渐
     * 向数组的底部(即朝最后一个元素)沉下去。这种算法用嵌套的循环对整个数组进行数次遍历，每次遍历都要比
     * 较数组中相邻的一对元素，如果这对元素以升序(或者值相等)的顺序排列，那么保持它们的位置不变；如果这
     * 对元素以降序的顺序排列，那么交换它们的值。(逐个比较，矮个子往前走)
	 * 
	 * */
	public static void bubble_1(){
		int[] num={100,60,80,90,70,30};
		System.out.println("请看排序的变化过程：");
		for(int i=0;i<num.length-1;i++){
			for(int j=0;j<num.length-i-1;j++){
				if(num[j]>num[j+1]){
					int temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;					
				}
				System.out.println("i="+i);
				for(int k=0;k<num.length;k++){
					System.out.print(num[k]+"\t");
				}
				System.out.println();
			}
		}
		System.out.println("排序后的结果为：");
		for(int k=0;k<num.length;k++){
			System.out.print(num[k]+"\t");
		}
	}
	
	/**Insertion
	 * 插入排序:
	 *	排序过程的某一中间时刻，数组R被划分成两个子区间R[1．．i-1]（已排好序的有序区）和
	 *	R[i．．n]（当前未排序的部分，可称无序区）。
	 *  插入排序的基本操作是将当前无序区的第1个记录R[i]插人到有序区R[1．．i-1]中适当的
	 *  位置上，使R[1．．i]变为新的有序区。因为这种方法每次使有序区增加1个记录，通常称增量法。
	 * 	从大到小，从小到大都可以
	 * 
	 * */
	public static void insert(){
		int[] a = {8,3,7,-2,12,6,22,4};
		System.out.println("排序前的数组:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		 int key = 0;
/*			//法一
			for(int j=1;j<a.length;j++){
				int i = 0;
				key = a[j];
				i = j-1;
				while(i>=0&&a[i]>key){
					a[i+1] = a[i];
					i--;
				}
				a[i+1] = key;
			}*/
		
		 for(int i=1;i<a.length;i++){
			 for(int j=0;j<i;j++){
				 if(a[j]<a[i]){
					 int temp = a[j];
					 a[j]=a[i];
					 a[i]=temp;
				 }
			 }
		 }
		 
		System.out.println("--------------排序后数组：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	/**选择排序:
	 * 在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找
	 * 最小的与第二个位置的数交换，如此循环到倒数第二个数和最后一个数比较为止。
	 * */
	public static void select(){
		int[] a = {8,3,7,-2,12,6,22,4};
		System.out.println("排序前的数组:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<a.length;i++){
			int po= i;//设定位置的初始值
		for(int j=0;j<a.length;j++){
			if(a[po]>a[j]){
				po = j;
			}
			//交换位置设定值（最小值）和第i数的位置
			int temp = a[i];
			a[i] = a[po];
			a[po] = temp;
		}
	}
		
		System.out.println("--------------排序后数组：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		bubble_1();
//		insert();
//		select();
		
	}
	
	
}
