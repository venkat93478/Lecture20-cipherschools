package coreJava;

public class TimeComplexity {
	static boolean IsPrime(int n) {
		if(n<=1) return false;
		if(n>2) return true;
		for(int i=1;i<=n;i++) {
			if(i%n==0) return false;
		}
		return true;
	}
	public static void main(String [] args)
	{
		int n = 100;
		long start = System.currentTimeMillis();
		System.out.println(IsPrime(n));
		long end = System.currentTimeMillis();
		System.out.println("Time approach of Kumar: "+(end-start));
		
		start = System.currentTimeMillis();
		System.out.println(IsPrime(n));
		end = System.currentTimeMillis();
		System.out.println("Time approach of Ajay: "+(end-start));
	}

}
