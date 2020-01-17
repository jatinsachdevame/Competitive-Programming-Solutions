import java.util.Scanner;
import java.util.*;

class Max_Dis_Between_Same_Element
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.maxDistance(arr,n));
		
		t--;
		}
	}
}// } Driver Code Ends
// your task is to complete this function
class GfG
{
    int maxDistance(int arr[], int n)
    {
        int max = 0;
        int diff=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;++i) {
            if(map.containsKey(arr[i])) {
                if(max < (i-map.get(arr[i]))) {
                    max = i-map.get(arr[i]);
                }
                
            } else if(!map.containsKey(arr[i])) {
                map.put(arr[i],i);
            }
        }
        return max;
    }
}
