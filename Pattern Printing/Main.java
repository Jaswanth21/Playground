import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in=new Scanner(System.in);
      int m=in.nextInt();
      int n=in.nextInt();
      int a[][]=new int[m][n];
      for(int k=0;k<m;k++)
      {
      for(int i=k;i<m;i++)
      {
        for(int j=k;j<n;j++)
        {
          if(i==k||j==k)
          {
            a[i][j]=n-k;
          }
        }
      }
      }
      for(int i=0;i<m;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(a[i][j]);
        }
        System.out.println();
      }
      
    }
}