public class Array5
{
public static void main(String[] args)
{
int arr[]={1,2,3,4};
int small=arr[0];
int length=arr.length;
for(int i=1;i<arr.length;i++)
{
if(small>arr[i])
{
small=arr[i];
}
}
System.out.println(small);
}
}