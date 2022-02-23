package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
int a=0;
int b=1;
int num=6;
int sum;
System.out.println(a);
System.out.println(b);
for(int i=0;i<num;i++) {
	sum=a+b;
	System.out.println(sum);
	a=b;
	b=sum;
}
	}

}
