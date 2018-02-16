package testProject;

public class AutoBoxing {
//Automatic conversion of primitive to wrapper class object is called  autoboxing, no need to create any object manually;
	public static void main(String[] args) {
		
		Integer A=10; //Autoboxbing, compiler convert int to Integer automatically by Autoboxing;
		System.out.println("Autoboxing technique: "+A);
  
		 Double D=20.12;  //Autoboxing
		 System.out.println("Autoboxing technique: "+D);
		 
		 Float F=30.25f;  //autoboxing, no need to create any object for wrapper class manually, compiler will create automatically;
		                 //after compilation this line will be "Long L=45l' to "Long L=45l=Long.valueOf()";
		 System.out.println("Autoboxing technique: "+F); 
		 
		 Long L=45l;     
		 System.out.println("Autoboxing technique: "+L);
		 
		 Integer I=new Integer(59); //its not a autoboxing here we are manually create object for wrapper class;
		 System.out.println("Manually created object: "+I);
	}

}
