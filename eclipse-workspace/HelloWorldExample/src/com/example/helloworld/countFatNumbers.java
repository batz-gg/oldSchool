package com.example.helloworld;

public class countFatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countFatNumbers());
//		System.out.println(factorial(5));
		
	}

	public static int countFatNumbers()
	{
		int count = 0;
		for (int i=1; i<=2147483647; i++)
		{
			int sum = 0;
			int j = i;
			
			// sum the factorials of each digit of j
			while (j > 0 && sum <= i)
			{
				sum += factorial(j%10);  // compute factorial of last digit of j and add it to sum
				j /= 10;  // shift j one place to the right
			}
			if (sum == i)  // if sum of digit factorials equals the number it is a fat number
				count++;
		}
		return count;
	}
	
	static int factorial(int n)
	{
		int fact = 1;
		for (int i = 2; i<=n; i++)
		{
			fact = fact * i;
		}
		
		return fact;
	}
}