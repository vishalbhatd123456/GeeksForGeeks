
public class countFirstBitSet {
	static int setCountSet(int n)
	{
		if(n == 0)
			return 0;
		int k = 1;
		int res = 0;
		while(true)
		{
			if(((n&(1<<(k-1))) == 0))
					k++;
			else
				return k;
		}
	}
	public static void main(String[] args) {
		int n = 9;
		System.out.println(setCountSet(n));
	}

}
