public class Calculator{
	public static void main (String[] args){
	int x = 10;
	if (x > 0) {
		System.out.println("x is more than 0 and equals " + x);
		System.out.println("x multiplied by 2 equals " + (x * 2));
		System.out.println("x divided by 2 equals " + (x/2));
		System.out.println("x plus 1 equals " + (x + 1));
		System.out.println("x minus 1 equals " + (x - 1));
		System.out.println("x in the 3rd degree equals " + (x*x*x));
		System.out.println("x divided by module and 2 equals " + (x % 2));


	}	else {
		System.out.println("x is less than 0");
	}
	
	}
	
}