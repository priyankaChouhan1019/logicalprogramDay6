import java.util.Scanner;
 class QuotientRemainder {

  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter dividend value");
        int dividend =sc.nextInt();
	System.out.println("Enter dividend value");
	int divisor =sc.nextInt();
    
  

    int quotient = dividend / divisor;
    int remainder = dividend % divisor;

    System.out.println("Quotient = " + quotient);
    System.out.println("Remainder = " + remainder);
  }
}