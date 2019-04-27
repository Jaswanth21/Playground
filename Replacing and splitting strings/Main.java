import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in=new Scanner(System.in);
      String s1=in.nextLine();
      String s2=in.nextLine();
      int n=in.nextInt();
      for(int i=0;i<s2.length();i++)
      {
        if(s2.charAt(i)==' ')
        {
          if(i==s2.length()-1)
            break;
          System.out.println();
          i++;
        }
        System.out.print(s2.charAt(i));
      }
    }
}