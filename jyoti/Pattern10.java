public class Pattern10
{
public static void main(String[] args)
{
int n=5;
int i;
int j;
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
if(j==1||i==1||j==n||i==n)
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.println();
}
}
}