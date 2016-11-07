package test;

public class ConvertRadix {
	
	private static char [] myName={'周','洪','利'};
	
	//输出16 ，2
	private static void printRadix(){
		for (int i = 0; i < myName.length; i++) {
			String binaryString=Integer.toBinaryString(myName[i]);
			String hexString=Integer.toHexString(myName[i]);
			System.out.println("十六进制:"+hexString);
			System.out.println("二进制:"+binaryString);
			System.out.println("高字节:"+String.valueOf(myName[i]>>8));
			System.out.println("低字节:"+String.valueOf(myName[i]&0xFF));
			System.out.println(Integer.toHexString(myName[i]&0xFF).charAt(0)=='1');
			System.out.println("加1二进制:"+Integer.toBinaryString((int)myName[i]+1));
			System.out.println("得到字符:"+(char)((int)myName[i]+1));
			char c[]=binaryString.toCharArray();
			if(c[c.length-1]=='1')
				c[c.length-1]='0';
			else
				c[c.length-1]='1';
			System.out.println("最低位取反:"+new String(c));
			int count=0;
			for (int j = 0; j <c.length; j++) {
				 //max(j)=14,所以14-j
				 count +=(c[j]-48)<<14-j;
			}
			System.out.println("得到字符:"+(char)count);
			int a=0;
			int b=1;
			System.out.println(a^b);
		}
	}
	public static void main(String[] args) {
		printRadix();
		try {
			System.out.println(2/0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("你好!出现错误了");
		}
	}
}
