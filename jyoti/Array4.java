public class Array4
{
public static void main(String[] args)
{
int arr[]={1,2,3,4};
int large=arr[0];
int length=arr.length;
for(int i=1;i<arr.length;i++)
{
if(large<arr[i])
{
large=arr[i];
}
}
System.out.println(large);
}
}