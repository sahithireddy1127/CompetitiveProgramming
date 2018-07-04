import java.util.*;

public class Applestock {
	public static void main(String [] args) {
	int stockPrices[]= {5,4,3,2,1};
	int i,min= stockPrices[0],current ,max= stockPrices[1]-min;
	
	for(i=1;i<stockPrices.length;i++) {
		current = stockPrices[i];
		int x=current - min;
		min= Math.min(current, min);
		max= Math.max(x, max);
		
		
		
	}
	System.out.println(max);
	

}
}
