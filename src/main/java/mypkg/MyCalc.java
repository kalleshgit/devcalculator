package mypkg;

public class MyCalc {
	
	int sum (int a, int b)
	{
		return a+b;
	}
	int diff (int a, int b)
	{
		return a-b;
	}
	int mul (int a, int b)
	{
		return a*b;
	}
	int mul (int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		MyCalc calc= new MyCalc();
		Bslave bbb=new Bslave();
		System.out.println("Sum is : "+calc.sum(20, 10));
		System.out.println("Diff is : "+calc.diff(20, 10));
		System.out.println("Multply is : "+calc.mul(20, 10));
		System.out.println("division is : "+calc.div(20, 10));
		 bbb.greet();

	}

}

