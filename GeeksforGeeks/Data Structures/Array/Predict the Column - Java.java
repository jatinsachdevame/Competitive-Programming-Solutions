//Initial Template for Java

import java.io.*;
import java.util.*;


 // } Driver Code Ends
//User function Template for Java

/*Class Geeks with its member function columnWithMaxZero()
* a[][] = matrix input
* n : number of rows and columns each
*/
class Geeks{
    
    static int columnWithMaxZero(int a[][],int N){
        int count1 = 0;
        int count2 = 0;
        int position = 0;
        for(int row=0;row<N;++row) {
            count1=0;
           for(int col = 0;col<N;++col) {
               if(a[col][row] == 0) {
                   count1++;
               }
           } 
           if(count1>count2) {
               count2 = count1;
               position = row;
               count1 = 0;
           }
        }
        return position;
        
    }
}

// { Driver Code Starts.

// Driver class
class GFG {
    
    // Driver code
	public static void main (String[] args) {
	    // Taking input using scanner class
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		
		while(testcase-- > 0){
		    int n = sc.nextInt();

		    int a[][] = new int[n][n];
		    
		    for(int i = 0;i<n;i++){
		        for(int j = 0;j<n;j++){
		            a[i][j] = sc.nextInt();
		        }
		    }
		    
		    Geeks obj = new Geeks();
		    System.out.println(obj.columnWithMaxZero(a, n));
		}
	}
}  // } Driver Code Ends
