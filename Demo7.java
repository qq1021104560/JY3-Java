import java.util.*;
public class Demo7

{
    public static void main(String[] args)
	{   

	   Scanner scanner = new Scanner (System.in);
	     System.out.print("�����������");
	     int num = scanner.nextInt();	
		 if (num>0 && num<=17)
		 {
                   System.out.print("δ����");
		 }
		 else if (num >= 18 && num < 30)
		 {
			    System.out.print("����");
		 }
		 else if(num >=30 && num < 100)
		 {
		       System.out.print("����");
		 }
		 else
		 {
		       System.out.print("�������");
		 }
		  System.out.print(num);

	}

}