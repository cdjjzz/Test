package test;


public class BinaryTest {
	public static void main(String[] args) {
		convert(0.1f);
	}
	private static void convert(float  f){
		char [] nums=(f+"").toCharArray();
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]=='.')
			 continue;
			System.out.println(nums[i]);
		}
		char [] s=Character.toChars(0x2F81A);
		for (int i = 0; i < s.length; i++) {
			System.out.println((short)s[i]);
			System.out.println(Integer.toHexString(s[i]));
		}
		char[] ch = Character.toChars(0x10400);  
        System.out.printf("U+10400 高代理字符: %04x\n", (int)ch[0]);//d801  
        System.out.printf("U+10400 低代理字符: %04x\n", (int)ch[1]);//dc00     
        String str = new String(ch);  
        System.out.println(str);
        System.out.println("代码单元长度: " + str.length());//2  
        System.out.println("代码点数量: " + str.codePointCount(0, str.length()));//1  
        System.out.println(str.codePointAt(0));//返回给定位置开始或结束的代码点,66560  
        System.out.println(str.charAt(0));//返回给定位置的代码单元,由于未定义，返回?  
	}
}
