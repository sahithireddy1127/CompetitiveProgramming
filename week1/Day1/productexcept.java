import java.util.*;
public class productexcept {
public static void main(String[] args) {
	int intarray[]= {1,2,3};
	int x= intarray.length;
	int leftarray[]= new int[x];
	int rightarray[] = new int[x];
	int i;
	
	leftarray[0]=1;
	for (i=1; i<intarray.length;i++) {
		int y= i;
		int mul=1;
		while(y!=0) {
			mul= mul * intarray[y-1];
			y=y-1;			
		}
		leftarray[i]=mul;
	}
		intarray= reverseArray(intarray);
		rightarray[0]=1;
		for (i=1; i<intarray.length;i++) {
			 int y= i;
			 int mul=1;
			while(y!=0) {
				mul= mul * intarray[y-1];
				y=y-1;			
			}
		rightarray[i]=mul;
		System.out.println(rightarray[i]);
		
		
		
	}
		
		rightarray= reverseArray(rightarray);
		System.out.println(Arrays.toString(rightarray));
		for (i=0; i<intarray.length;i++) {
			rightarray[i]= leftarray[i]* rightarray[i];
			System.out.println(rightarray[i]);
			
		}
		
		
			
		}
		
	
	
	
	
	

public static void swap(int[] arr,int a,int b)
{
   int temp=arr[a];
   arr[a]=arr[b];
   arr[b]=temp;        
}
public static int[] reverseArray(int[] arr){
   int size=arr.length-1;

   for(int i=0;i<size;i++){

       swap(arr,i,size--); 

   }

   return arr;
}
	
	

}
