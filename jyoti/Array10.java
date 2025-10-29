public class Array10
{
public static void main(String[] args)
{
int secondlarge=-1;
int large=-1;
int arr[]={10,20,40,30,60};
int length=arr.length;
for(int i=0;i<length;i++)
{
if(arr[i]>large)
{
secondlarge=large;
large=arr[i];
}
else if(arr[i]>secondlarge)
{
secondlarge=arr[i];
}
}
System.out.println("the secondlarge element is:"+secondlarge);
}
}