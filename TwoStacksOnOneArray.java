package Stack;

public class TwoStacksOneArr {
	int arr[];
	int cap;
	int top1;
	int top2;
	public TwoStacksOneArr(int n) {
		// TODO Auto-generated constructor stub
		cap = n;
		top1= -1;
		top2 = cap;
		arr = new int[n];
	}
	
	void push1(int x)
	{
		if(top1<top2-1)
		{
			arr[++top1] = x;
		}
	}
	void push2(int x)
	{
		if(top1<top2-1)
		{
			arr[--top2] = x;
		}
	}
	
	int pop1()
	{
		if(top1>=0)
		{
			int x = arr[top1];
			top1--;
			return x;
		}
		return -1;
		//System.exit(1);
	}
	int pop2()
	{
		if(top2<cap)
		{
			int x = arr[top2];
			top2--;
			return x;
		}
		return -1;
	}
	public static void main(String[] args) {
		
	}
}
