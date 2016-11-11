package test;

import java.lang.reflect.Type;

public class Point {
   public static void main(String[] args) {
	   last:
		   for (int i = 0; i < 10; i++) {
			 for (int j = 0; j < 10; j++) {
				 if((i&1)==0)
						System.out.println(i);
					else
						break last;
			}
		}
   		System.out.println("----------------------------------");
   		boolean flag=true;
   		for (int i = 0; i <10; i++) {
			for (int j = 0; j <10&&flag; j++) {
				 if((i&1)==0)
						System.out.println(i);
					else{
						flag=false;
					}
			}
		}
   		System.out.println(5555555);
	   
   }
   private int indexof(String source,String target){
	   char c[]=source.toCharArray();
	   char t[]=source.toCharArray();
	   int c_len=c.length;
	   int t_len=t.length;
	   int i=0;
	   while(i+t_len<=c_len){
		   for (int j = 0; j <t_len&&i<c_len; j++,i++) {
			 if(c[i]!=t[j])
				 i=i-j+1;
		   }
	   }
	   return -1;
   }
}
