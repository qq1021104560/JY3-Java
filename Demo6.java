import java.util.*;
public class  Demo6
{
	public static void main(String[] args) 
	{    
		String good = "";
		Scanner scanner = new Scanner(System.in);	          
	    System.out.print("��������Ҫ�����������ȼ���");
		int num = scanner.nextInt();	   
          switch(num)
          {
              case 20 :
			  good = "С���ӣ�����18�����Ҷ�����aabbͬ������";
              break;
			  case 18 :
			  good = "�ְָ����ͷ�ˣ������ϰ�";
              break;
			  case 16 :
			  good = "��Ҷ������ף��������ϰ�";
              break;
			  case 15:
			  good = "���15���Ҹҵ���";
              break;
			  default:
			   good = "�Ǻǣ��Ѿ�������";
		  }       	
		  System.out.print(good);
				
	}
}
