import java.util.*;
public class  Demo5
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);	
	              int Username = 1;
		          int Password = 2;  
			      System.out.print("�������û�����");
				  String num = scanner.next();	   
			      System.out.print("���������룺");
				  String pass = scanner.next();
                  int c1 = num.charAt(0);	
				  int c2 = pass.charAt(0);			 
				  if(c1 == '1' && c2 == '2'){
				  System.out.print("��¼�ɹ�");
				  }
				  else{
				  System.out.print("��¼ʧ��");
				  }
	}
}
