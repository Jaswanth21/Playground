import java.util.Scanner;
class Main
{
	public static void main (String args[])
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      prime(n);
	}
  public static void prime(int n)
  {
    int f=0;
    for(int i=2;i<n;i++)
    {
      for(int j=1;j<=i;j++)
      {
      if(i%j==0)
        f++;
      }
      if(f==2)
        System.out.println(i);
      f=0;
    }
  }
        
}