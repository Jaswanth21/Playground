import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int a=in.nextInt();
int b=in.nextInt();
power(a,b);
}
public static void power(int a,int b)
{
int i,k=1;
i=b;
while(i>0)
{
k=k*a;
i--;
}
System.out.print(k);
}
}

