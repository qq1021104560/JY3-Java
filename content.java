public class content
{
     public static void main(String[] args)
     {
		  //int����
        int age1 = 10;
		System.out.println(age1);
		int age2 = 20;
		System.out.println(age2);
         //int��������
        int old = 20;
	     System.out.println(old);
      	int old1 = 22;
         System.out.println(old1);
	     System.out.println(old1+old);
     
         //intת��long
	    long name = 12345678901l;
		 System.out.println(name);
         //floatת��double
		float name1 = 3.1415926f;
		 System.out.println(name1);
        //double����
		double name2 = 1234567890.0987654321;
		 System.out.println(name2);
          //�ַ�0������
		 char zero = '0';
         System.out.println((int)zero);
           //97���ַ�
		 char num = 97;
		 System.out.println(num);
          //���a-z
		 String chars = "abcdefghijklmnopqrstuvwxyz";
         System.out.println(chars.charAt((int)(Math.random() * 26)));

         int num1 = 19;
		 //������
		 System.out.println(Integer.toBinaryString(num1));
		 //�˽���
		 System.out.println(Integer.toOctalString(num1));
		 //ʮ������
		 System.out.println(Integer.toHexString(num1));
          //���0-9������
         String number = "0123456789";
         System.out.println(number.charAt((int)(Math.random() * 10)));
          //����
		 float one = (float)3.1245869888888;
		 int two = (int)one;
		 System.out.println(two);
		 //5
		 double guangnian = 9460500000000.0*4.2;
		 double birg =0.000384;
         System.out.println(guangnian/birg);
		 //��������
		   double time = 2*10*384;
		   System.out.println(Math.sqrt(time));
		 long q1 = 50000l;
		 System.out.println(q1*q1*q1);

          int q2 = 3;
         System.out.println((char)q2);
           
		   char q3 = '��';
		   System.out.println((char)(q3+45));
           
		   char q4 = '��';
		   System.out.println((int)q4);


     }
	     

		  
}