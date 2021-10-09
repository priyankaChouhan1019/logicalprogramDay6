import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
	int num,firstnum=0,secnum=1,thirdnum;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	num=sc.nextInt();
          for(int i=0;i<num;i++)
	{
		System.out.println(firstnum +" ");
	thirdnum =firstnum + secnum;
	firstnum=secnum;
	secnum=thirdnum;
	}
       
    }
}	