package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
int input=123;
int sum=0; 
int remainder=0;
while (input>0) {
	remainder= input%10;
	System.out.println(remainder);
	sum=sum+remainder;
	System.out.println(sum);
	input=input/10;
	System.out.println(input);
}

System.out.println("Sum is"+sum);
	}

}
