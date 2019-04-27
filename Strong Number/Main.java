import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int i,j=1,k,sum=0,x,h;
      k=n;
      while(k>0)
      {
        h=k%10;
        for(x=1;x<=h;x++)
        {
          j=j*x;
        }
        
        sum=sum+j;
        k=k/10;
        j=1;
	}

      if(sum==n)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}