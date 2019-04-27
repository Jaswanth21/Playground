import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=Add(n);
      System.out.print(a);
	}
  public static int Add(int m)
  {
    int s=0;
    while(m>0)
    {
      s=s+m;
      m--;
    }
    return s;
  }
}