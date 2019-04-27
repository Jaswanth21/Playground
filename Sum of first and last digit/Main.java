import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n%10;
      int b,k=0,u=1;
      b=n;
      while(b>0)
      {
        k++;
        b=b/10;
      }
      for(int i=1;i<k;i++)
      {
        u=u*10;
      }
      int r=n/u;
      System.out.print(a+r);
	}
}