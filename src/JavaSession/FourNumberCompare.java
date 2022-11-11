package JavaSession;

public class FourNumberCompare {

	public static void main(String[] args) {
         int a=10;
         int b=200;
         int c=30;
         int d=40;
         
         if(a>b && a>c && a>d) {
        	 System.out.println("a is geater number");
         }
         else if(b>c && b>d) {
        	 System.out.println("b is greater number");
         }
         else if(c>d) {
        	 System.out.println("c is greater number");
         }
         else {
        	 System.out.println("d is greater number");
         }
	}

}
