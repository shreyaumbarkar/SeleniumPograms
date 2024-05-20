package mypkg2;
class A
{
	int a=8;
	public void display() {
	}
	{
		System.out.print("a=  "+a);
	}
	
}
class B extends A
{
	int a=7, ans; 
	public void add()
	{
		ans= super.a+a;
	}
	public void display() {
	}
	{
		super.display();
		System.out.println("add is  "+ ans);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		B obj= new B();
		obj.add();
		obj.display();	
	}

}
