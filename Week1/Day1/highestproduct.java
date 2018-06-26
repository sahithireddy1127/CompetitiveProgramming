import java.util.*;
public class highestproduct {
	public static void main(String args[]) {
	int ar[]={-10, 1, 3, 2, -10};
	int a,b,c,i,min1,min2;
	a=ar[0];
	b=ar[1];
	c=ar[2];
	min1=0;
	min2=0;
	
	
	if (a>b) {
		if(a<c) {
			int temp=a;
			a=c;
			c=temp;
			
		}	
	}
	else {
		if(b<c) {
			int temp=a;
			a=c;
			c=temp;
			
		}
		else {
			int temp=a;
			a=b;
			b=temp;
		}
		
	}
	if(b<c) {
		int temp= c;
		c= b;
		b= temp;
		
	}
	for (i=3;i<ar.length;i++) {
		System.out.println(ar[i]);
		if(ar[i]>a) {
			c=b;
			b=a;
			a=ar[i];
			
		}
		else if (ar[i]>b) {
			c=b;
			b=ar[i];
		}
		else if(ar[i]>c) {
			c=ar[i];
		}
		if(ar[i]<=min1) {
			
			min2=min1;
			min1=ar[i];
			//System.out.println(min1);
			
		}
		else if(ar[i]<=min2) {
			//System.out.println(min2);
			
			min2=ar[i];
		}
		
	}
	if(min2<0) {
		int res1 = a*min1*min2;
		int res2=a*b*c;
		System.out.println(min1);
		System.out.println(min2);
		System.out.println(Math.max(res1, res2));
		
		
	}
	else {
		//System.out.println(a*b*c);
	}
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
