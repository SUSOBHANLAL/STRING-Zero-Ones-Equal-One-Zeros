package zeroONEequaloneero;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int k= 0;k<t;k++) {
			int n = sc.nextInt();
			  
		    for (int j=0;j<n ;j++ ) {
		        if(j==0 || j==n-1){
		             System.out.print("1");
		        }else{
		            System.out.print("0");
		        }
		       
		    }
		    System.out.println();
			
		}
	}

}
