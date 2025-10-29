public class Array12
{
public static void main(String[] args)
{
int secondlarge=-1;
int large=-1;
int thirdlarge=-1;
int arr[]={10,20,40,60,30,60,60};
int length=arr.length;
for(int i=0;i<length;i++)
{
if(arr[i]>large)
{
thirdlarge=secondlarge;
secondlarge=large;
large=arr[i];
}
else if(arr[i]>secondlarge && arr[i]!=large && && arr[i]!=thirdlarge)
{
thirdlarge=secondlarge;
secondlarge=arr[i];
}
else if(arr[i]>thirdlarge && arr[i]!=secondlarge && arr[i]!=thirdlarge)
{
thirdlarge=arr[i];
}
}
System.out.println("the element thirdlarge is:"+thirdlarge);
}
}