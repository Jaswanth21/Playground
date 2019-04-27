import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here  
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=square(n);
      System.out.print(a);
	} 
  public static int square(int m)
  {
    int u=m*m;
    return u;
  }
}