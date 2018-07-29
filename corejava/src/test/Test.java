package test;

public class Test {
	
	public static void print(){
		// 定义一些变量，用来格式化输出。  
        double d = 345.678;  
        String s = "你好！";  
        int i = 1234;  
        // "%"表示进行格式化输出，"%"之后的内容为格式的定义。 
        // "f"表示格式化输出浮点数。 
//        System.out.printf("%f", d); //345.678000
//        System.out.println();  
        // "9.2"中的9表示输出的长度，2表示小数点后的位数。 注意输出数字前面的空格 
        System.out.printf("%1.2f", d);//   345.68
        System.out.println();  
        // "+"表示输出的数带正负号。  
        /*  System.out.printf("%+9.2f", d);//  +345.68
        System.out.println();  
        // "-"表示输出的数左对齐（默认为右对齐）。  
        System.out.printf("%-9.4f", d);//345.6780
        System.out.println();  
        // "+-"表示输出的数带正负号且左对齐。  
        System.out.printf("%+-9.3f", d);//+345.678
        System.out.println();  
        // "d"表示输出十进制整数。
        System.out.printf("%d", i);//1234
        System.out.println();  
        // "o"表示输出八进制整数。 
        System.out.printf("%o", i);//2322
        System.out.println();  
        // "x"表示输出十六进制整数。  
        System.out.printf("%x", i);//4d2
        System.out.println();  
        // "#x"表示输出带有十六进制标志的整数。  
        System.out.printf("%#x", i);//0x4d2
        System.out.println();  
        // "s"表示输出字符串。
        System.out.printf("%s", s);//你好！ 
        System.out.println();  
        System.out.printf("输出一个浮点数：%f，一个整数：%d，一个字符串：%s", d, i, s);
        //输出一个浮点数：345.678000，一个整数：1234，一个字符串：你好！
*/       

		
	}
	
	public static void sortPrint(int[] num){
		for(int i=0;i<num.length;i++)
			System.out.print(num[i] + "\t");
	}
	public static void sortBubble(int[] num){
		for(int	i=0;i<num.length-1;i++){
			for(int j=1;j<num.length-1-1;j++){
				if(num[j]>num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
			System.out.println("i="+i);
			sortPrint(num);
			System.out.println();
		}
	
	}
	public static void arrayMax(int[] num){
		int result = num[0];
		for(int i=1;i<num.length;i++){
			if(result<num[i])
				result = num[i];
		} 
		System.out.println("result="+result);
	}
	public static void arrayAvg(int[] num){
		double result = 0;
		for(int i=0;i<num.length;i++){
			result +=num[i]; 
		}
		result /= num.length;
		System.out.println("result="+result);
	}
	public static void arrayTest(){
		//1.
		int array[];
		int []arr = {1,2,3};
		int length = arr.length;
		int i = arr[1];
		//2.
		String[][] roon = new String[2][3];
		roon[0] = new String[]{"",null,"1"};
		roon[1] = new String[]{"",null,"2"};
		String[][] roon1 = {
				{"",null,"1"},
				{"",null,"2"}
		};
		
		int[] num = {20,40,30,70,10}; 
		//3.avg
//		arrayAvg(num);
		//4.max
//		arrayMax(num);
		//5.bulle sort
//		sortBubble(num);
/*		sortPrint(num);
		System.out.println();
		Arrays.sort(num);
		sortPrint(num);
		System.out.println();*/
//		System.out.println(Arrays.toString(num));
		
	}
	public static void main(String[] args) {
		arrayTest();
		print();
		
	}
}
