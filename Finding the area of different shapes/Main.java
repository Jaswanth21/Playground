import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      switch(n)
      {
        case 1:
          int a=in.nextInt();
          System.out.print(a*a);
          break;
        case 2:
          int b=in.nextInt();
          int c=in.nextInt();
          System.out.print(b*c);
          break;
        case 3:
          int d=in.nextInt();
          int e=in.nextInt();
          System.out.print((d*e)/2);
          break;
        case 4:
          int f=in.nextInt();
          System.out.print(3.14*f*f);
          break;
      }
    }
}