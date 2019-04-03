public class HomeWork       
  {
     public static void main(String[] arge)
     {
     //Á·Ï°1

           int num = 48;
           System.out.println((char)num);

		   char word = 'ÖĞ';
		   System.out.println((int)word);
	       
	 //Á·Ï°2
	       
           int x = 3;
		   int y = f(x);
		   System.out.println(y);


     //Á·Ï°3
           int x1 = 5;
		   int y1 = f1(x1);
		   System.out.println(y);
		     
            int x2 = 5;
			int y2 = f2(x2);
			System.out.println(y2);
	 
	     
     }



         
		 public static int f(int x)
	 
		 {
		   int y = x*x-2*x+4;
		    return y;   
	     }
         

		   
		 public static int f1(int x1)
	 
		 {
		   int y1 = x1/3;
		    return y1;   
	     }


		 	   
		 public static int f2(int x2)
	 
		 {
		   int y2 = x2++;
		    return y2;   
	     }

   }