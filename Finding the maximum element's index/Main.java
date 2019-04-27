import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n+1];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    int max=arr[0];
    int pos=0;
    for(int i=1;i<n;i++)
    {
      if(max<arr[i])
      {
        max=arr[i];
        pos=i;
      }
    }
    System.out.print(pos);
  }
}