import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n+1];
    int a[]=new int[n];
    int k=0,h=0,j=0;
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
    for(int i=1;i<=n;i++)
    {
      k=k+arr[i-1];
      if(i%3==0)
      {
        a[j++]=k;
        k=0;
      }
    }
    for(int l=0;l<j;l++)
    {
      if(a[l]==a[l+1])
        h=1;
    }
    if(h==0)
      System.out.print("Not a Perfect Batch");
    else
      System.out.print("Perfect Batch");
  }
}