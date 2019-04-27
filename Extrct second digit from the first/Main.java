import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int b,k=0,u=1;
    b=n;
    while(b>0)
    {
      k++;
      b=b/10;
    }
    for(int i=1;i<k-1;i++)
      u=u*10;
    int h=n/u;
    int p=h%10;
    System.out.print(p);
  }
}