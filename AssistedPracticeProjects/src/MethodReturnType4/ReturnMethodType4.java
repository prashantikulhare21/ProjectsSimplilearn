package MethodReturnType4;



public class ReturnMethodType4 {
	   int m1()
	  { 
		   System.out.println("int method:"); 
		      return 578; 
		  } 
		  float m2() 
		  { 
		    System.out.println("float method:"); 
		      return 567.8f; 
		  } 
		  String m3()
		  { 
		    System.out.println("string method:"); 
		     return "Java"; 
		  } 
		  double m4()
		  {
			  System.out.println("double method:");
			  return 243.4;
		  }
		  char m5()
		  {
			  System.out.println("char method:"); 
			     return 'v'; 
		  }
		public static void main(String[] args)
		 { 
			ReturnMethodType4 s = new ReturnMethodType4();
		      int i = s.m1(); 
		    System.out.println("Return value of m1 method is " +i); 
		    float f = s.m2();
		    System.out.println("Return value of m2 method is " +f); 
		    String str = s.m3(); 
		    System.out.println("Return value of m3 method is " +str);
		    double d = s.m4(); 
		    System.out.println("Return value of m4 method is " +d);
		    char ch = s.m5(); 
		    System.out.println("Return value of m5 method is " +ch);
		  } 

	}

