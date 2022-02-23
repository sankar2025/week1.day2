package week1.day2;

public class Calculator 
{
	int num1=10;
	int num2=20;
	int num3=30;
	public int add() 
	{
		int add=(num1+num2+num3);
			
	System.out.println(add);
	return add;
	}

	public int sub()
	{
		int sub=(num1-num2);
		System.out.println(sub);
		return sub;
	}
	
	public double mul()
	{
		double mul=num1*num2;
		System.out.println(mul);
		return mul;
	}
	public float divide()
	{
		float divide=(num1/num2);
		System.out.println(divide);
		return divide;
	}
}
