public class Array9
{
public static void main(String[] args)
{
int key=5;
int count=0;
int arr[]={5,6,7,5,10,11,5,5,9,6,2};
int length=arr.length;
for(int i=0;i<length;i++)
{
if(key==arr[i])
{
count++;
}
}
System.out.println("My key value is"+count +"time appears.");
}
}