class Pattern11
{
public static void main(String[] args)
{
int n=5;
for(i=0;i<=4;i++)
{
for(j=1;j<=4;j++)
{
if(j==0||i==0||j=n-1||i=n-1)
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.print();
}
}
}