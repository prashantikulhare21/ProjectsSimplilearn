package StringBuffer8;

public class string {
	public static void main(String[] args) {
		System.out.println("Methods of Strings");
		
		String sl=new String("Good Morning");
		System.out.println(sl.length());

		
		String A=new String("Welcome");
		System.out.println(A.substring(2));


		String s1="Hii";
		String s2="Hello";
		System.out.println(s1.compareTo(s2));

		
		String s4="";
		System.out.println(s4.isEmpty());

		
		String s5="Hii";
		System.out.println(s1.toLowerCase());
		
		
		String s6="Hello";
		String replace=s2.replace('d', 'n');
		System.out.println(replace);

		
		String x="Welcome to India";
		String y="Welcome tO india";
		System.out.println(x.equals(y));

		System.out.println("\n");
		System.out.println("Creating StringBuffer");
		
		StringBuffer t=new StringBuffer("Welcome to Java!");
		t.append("The is Nisha");
		System.out.println(t);


		t.insert(0, 'd');
		System.out.println(t);

		
		StringBuffer sb=new StringBuffer("Hello");
		sb.replace(0, 2, "hEl");
		System.out.println(sb);


		sb.delete(0, 1);
		System.out.println(sb);
		
		
		System.out.println("\n");
		System.out.println("Creating StringBuilder");
		StringBuilder sb1=new StringBuilder("Happy");
		sb1.append("Learning");
		System.out.println(sb1);

		System.out.println(sb1.delete(0, 1));

		System.out.println(sb1.insert(1, "Welcome"));

		System.out.println(sb1.reverse());
				
		
		System.out.println("\n");
		System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
		
		String str = "Hello"; 
	    
	   
	    StringBuffer sbr = new StringBuffer(str); 
	    sbr.reverse(); 
	    System.out.println("String to StringBuffer");
	    System.out.println(sbr); 
	      
	    
	    StringBuilder sbl = new StringBuilder(str); 
	    sbl.append("world"); 
	    System.out.println("String to StringBuilder");
	    System.out.println(sbl);              		
	}
	}

