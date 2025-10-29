public class Array8
{
public static void main(String[] args)
{
int key=8;
int flag=0;
int arr[]={10,5,9,8,7,6};
int length=arr.length;
for(int i=0;i<length;i++)
{
if(key==arr[i])
{
flag=1;
break;
}
}
if(flag==1)
{
System.out.println("element is found");
}
else
{
System.out.println("element is not found");
}
}
}