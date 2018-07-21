package stacks;
import java.util.Arrays;

public class conseones {
public static int conone(int n)
{
int count=0;
while(n!=0)
{
if(n%2!=0)
count++;
n=n/2;
}
return count;
}

public static void numcount(int num)
{
int[] arr=new int[num+1];
for(int i=1;i<=num;i++)
{
arr[i]=conone(i);
}
System.out.println(Arrays.toString(arr));

}

public static void main(String[] args)
{
numcount(15);
numcount(16);
numcount(1);
numcount(25);
numcount(5);
numcount(6);

}
}
