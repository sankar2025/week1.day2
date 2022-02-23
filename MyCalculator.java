package week1.day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj=new Calculator();
		int sumAns= obj.add();
		int subAns= obj.sub();
		double mulAns= obj.mul();
		float divAns= obj.divide();

		System.out.println(sumAns);
		System.out.println(subAns);
		System.out.println(mulAns);
		System.out.println(divAns);
	}

}
