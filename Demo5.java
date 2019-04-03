import java.util.*;
public class  Demo5
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);	
	              int Username = 1;
		          int Password = 2;  
			      System.out.print("请输入用户名：");
				  String num = scanner.next();	   
			      System.out.print("请输入密码：");
				  String pass = scanner.next();
                  int c1 = num.charAt(0);	
				  int c2 = pass.charAt(0);			 
				  if(c1 == '1' && c2 == '2'){
				  System.out.print("登录成功");
				  }
				  else{
				  System.out.print("登录失败");
				  }
	}
}
