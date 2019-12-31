import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int T,N;
		Scanner scanner = new Scanner(System.in);
		T = scanner.nextInt();
		for(int i=0;i<T;++i) {
		    N = scanner.nextInt();
		    int[] arr = new int[N];
		    int[] brr = new int[N];
		    int max = 0;
		    for(int j=0;j<N;++j) {
		        arr[N-j-1] = scanner.nextInt();
		    }
		    max = arr[0];
		    int count=0;
		    for(int a=0;a<N;++a) {
		        if(max<=arr[a]) {
		            max = arr[a];
		            brr[count] = max;
		            ++count;
		        }
		    }
		    StringBuffer s = new StringBuffer();
		    for(int a = count-1;a>=0;--a) {
		        s.append(brr[a] + " ");
		    }
		    System.out.println(s);
		}
	}
}
