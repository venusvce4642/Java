import java.util.*; // we need to import this package for to use Scanner class
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner s=new Scanner(System.in);
	
		
		System.out.println("enter the string:");
		String s1=s.nextLine();//function to read sentence
		System.out.println("enter the string:");
		String s2=s.next();//function to read string or Word
        System.out.println("enter two integers:");
        int a,b;
        a=s.nextInt();
        b=s.nextInt();//function to read integers
        System.out.println(s1);
         System.out.println(s2);
          System.out.println(a+" "+b);
		//next function can read only one woed whwnever space encountred it stops reading
		System.out.println("you entered string is "+s1 +" "+s2);
	
	

	}
}
