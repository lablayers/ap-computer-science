/**
 * 
 * Summation Recursion
 s* 24.4a Propose It
 * @author Victor Lourng
 * 
 * A summation method returns the sum of the numbers from a lower bound to an upper bound.
 * 
 * You will propose a static recursive method that will compute summations.
 * You will also run it with a tester program that displays the values of the
 * parameters on each call and the returned value on each call.
 *
 */
public class Summation {

private static int low,high,result; //VARIABLES USED IN THIS CLASS.

//CONSTRUCTOR METHOD 1

public Summation(){

low=1;

high=10;

result = sum(low,high);

}

//CONSTRUCTOR METHOD 2

public Summation(int a, int b){

low = a;

high = b;

result = sum(low,high);

}

//STATIC METHOD FOR SUM

private static int sum(int a, int b){
	
	System.out.println("Parameter a: " + a);
	System.out.println("Parameter b: " + b);

	// TYPE HERE THE CODE FOR THE RECURSIVE SUM.
	int sum;
	sum = a+b;
	System.out.println("Sum of both parameters: " + sum);

	a++;
	b--;
	if ( a == b ) {
		System.out.println("Parameter a and b match:" + a);
		return sum + a;
	}
	if ( ( b - a == -1) ) {
		return sum;
	}
	else {
		return sum + sum(a,b);
	}
	
}

public String toString(){

String a = "The recursive sum is: " + result;

return a;

}

}

