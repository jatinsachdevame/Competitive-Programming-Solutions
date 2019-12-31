class GfG
{
    int convertfive(int num)
    {
	int n2 = num;
	int q,r;
	int result=0;
	int count = 1;
	while(n2>0) {
	    r = n2%10;
	    q = n2%10;
	    if(r==0) {
	        r = 5;
	    }
	    r = r*count + result;
	    result = r;
	    count = count*10;
	    n2 = n2/10;
	    
	}
	return result;
    }
}
