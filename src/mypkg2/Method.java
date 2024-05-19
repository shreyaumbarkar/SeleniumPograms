package mypkg2;

class Myclass 
{
	int a;
	public void show (int a)
	{
		if (a%2==0){
	System.out.print("Number is even");
}
		else {
			System.out.println("Number is odd");
		}

	}
}
public class Method{
	public static void main (String args[]) {
		Myclass obj=new Myclass();
	obj.show(10);
}
}