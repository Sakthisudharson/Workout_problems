import java.util.*;
class number
{
public static void main(String[]args)
{
int i,j;
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(i=n;i>=1;i--)
{
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{
System.out.print(j+" ");
}
System.out.println();
}
}
}
        