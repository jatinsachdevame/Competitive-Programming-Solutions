import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		int N,D;
		for(int i=0;i<T;++i) {
		    N = scanner.nextInt();
		    D = scanner.nextInt();
		    int[] arr = new int[N];
		    if(D>N)
                {D %= N;}
		    for(int j=0;j<N;++j) {
		        arr[j] = scanner.nextInt();
		    }
		    StringBuffer s = new StringBuffer();
		    for(int k=D;k<N;++k) {
		       s.append(arr[k]+" ");
		    }
		    for(int l=0;l<D;++l) {
		        s.append(arr[l] + " ");
		    }
		    
		    
		    System.out.println(s);
		}
	}
}
