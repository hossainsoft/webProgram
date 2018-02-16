package testProject;

class anclas{
int a;


void meth()
{
	System.out.println(" a= "+a);
	}
}

public class AnnonymousObject2 {

	public static void main(String[] args) {
    System.out.println(" annonymous object every time need to creates  object");
    System.out.println(" that the reason after assign a value of 10 but when its call again its become a zero");
    
	new anclas().a=10;
	new anclas().meth();
	
	System.out.println(" reference object every time not need to creates  object thats why a value still 10");
	
	anclas z=new anclas();
	z.a=10;
	z.meth();
		}

}
