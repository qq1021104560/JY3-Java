import java.util.*;
public class  Demo6
{
	public static void main(String[] args) 
	{    
		String good = "";
		Scanner scanner = new Scanner(System.in);	          
	    System.out.print("请输入你要增幅的武器等级：");
		int num = scanner.nextInt();	   
          switch(num)
          {
              case 20 :
			  good = "小伙子，想上18经过我斗鱼恶霸aabb同意了吗";
              break;
			  case 18 :
			  good = "爸爸给你磕头了，求你上啊";
              break;
			  case 16 :
			  good = "大家都不容易，求求你上啊";
              break;
			  case 15:
			  good = "振幅15，敢敢单单";
              break;
			  default:
			   good = "呵呵，已经是碎了";
		  }       	
		  System.out.print(good);
				
	}
}
