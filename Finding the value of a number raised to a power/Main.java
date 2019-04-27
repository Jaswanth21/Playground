import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in=new Scanner(System.in);
      int b=in.nextInt();
      int k=1;
      int e=in.nextInt();
      for(int i=1;i<=e;i++)
      {
        k=k*b;
      }
      System.out.print(k);
    }
}