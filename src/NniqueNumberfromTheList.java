import java.util.ArrayList;

public class NniqueNumberfromTheList {

	public static void main(String[] args) {
		
		int a[]= {4,5,5,4,5,4,6,9,6};
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0; i<a.length; i++) {
			int k=0;
		
			if( ! al.contains(a[i])) {
				
				al.add(a[i]);
				k++;
				for(int j=i+1; j<a.length;j++) {
					if(a[j] == a[i]) {
						k++;
					}
				}
				//System.out.println(a[i]);
				//System.out.println(k); //eliminates duplicates and prints unique numbers
				if(k==1)  				// prints only unique number
					System.out.println(a[i] + "  this is the unique number in the list");
			}
			
		
		}

	}
}
