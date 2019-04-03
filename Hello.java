import java.util.*;

public class Hello
{
   public static void main(String[] args)
   {
     Scanner scanner = new Scanner(System.in);
     System.out.print("输入要转换字符：");
      String num = scanner.next();
	  char specialChar = num.charAt(0);
	   int result = getCharToInt(specialChar);
	  System.out.print("转换后的字符为:"+result);
   
   }
   //int转换char方法
   public static char geIntToChar(int num)
   {
      char char1 = (char)num;
      return char1;
   
   }
    public static int getCharToInt (char c)
	{
	   return c ;
	}


}