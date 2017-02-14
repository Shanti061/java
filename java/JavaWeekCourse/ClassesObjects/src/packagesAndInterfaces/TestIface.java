package packagesAndInterfaces;

interface CallBack
{
	void callback(int param); //no implementation
}

//implement callback interface
class Client implements CallBack
{

	@Override
	public void callback(int param) {
		System.out.println("callback called with " + param);		
	}
	
	void nonIfaceMeth()
	{
		System.out.println("Classes that implement interfaces " +
							"may also define other members, too.");
	}

}

class AnotherClient implements CallBack
{

	@Override
	public void callback(int param) {
		System.out.println("Another version of callback");
		System.out.println("param squared is " + (param * param));	
	}	
}
//this class included an interface but not fully implement the method required.
abstract class Incomplete implements CallBack
{
	int a,b;
	
	void show()
	{
		System.out.println(a + " " + b);
	}
}


class TestIface {

	public static void main(String[] args) {
		
		//EXAMPLE 1: Declare variable as object references that use an interface rather than a class type.
		//When you call a method through one of these references, the correct version will be called
		//based on the actual instance of the interface being referred to.
		CallBack c = new Client();
		c.callback(42); //NOTE: c cannot access any other members of Client class.
		
		
		//EXAMPLE 2:
		AnotherClient ob = new AnotherClient();
		c = ob;	//c now refers to AnotherClient object
		c.callback(42);
	}

}
