import java.util.*;
public class Demo7

{
    public static void main(String[] args)
	{   

	   Scanner scanner = new Scanner (System.in);
	     System.out.print("输入你的年龄");
	     int num = scanner.nextInt();	
		 if (num>0 && num<=17)
		 {
                   System.out.print("未成年");
		 }
		 else if (num >= 18 && num < 30)
		 {
			    System.out.print("中年");
		 }
		 else if(num >=30 && num < 100)
		 {
		       System.out.print("老年");
		 }
		 else
		 {
		       System.out.print("输入错误");
		 }
		  System.out.print(num);

	}

}