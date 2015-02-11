
public class ProjectEuler {
	
	public static void main(String[] args) 
		{
		System.out.println("Question 1: "+ MultiplesOf3And5());
		System.out.println("Question 2: "+ EvenFibonacciNumbers());
		System.out.println("Question 3: "+ SmallestMultiple());
		System.out.println("Question 4: "+ SumSquareDifference());
		System.out.println("Question 1: "+ LongestCollatzSequence());
		}

	public static int MultiplesOf3And5()
		{
			int sum = 0;
			for (int a=2 ; a<998 ; a++)
				{
					if (a%3 == 0||a%5==0)
						{
						sum+=a;	
						}
				}
			return sum;
		}
	
	
	public static int EvenFibonacciNumbers()
		{
			int total = 0;
			int value1 = 1;
			int value2 = 0;
			int value0 = 1;
			while (value2 <= 4000000)
				{
				value2 = value2 + value1;
					if (value2 % 2 == 0)
						{
						total = total + value2;
						}
					value1 = value0 = value2;
				}
			return total;
		}
	
	public static int SmallestMultiple()
	{
		int num=2520, calc=0;
		boolean right = false;
		while (right == false)
			{
				for(int i = 1; i< 21; i++)
					{
						if(num % i == 0)
							{
							calc++;
							}
					}
				
				if (calc != 20)
					{
					right = false;
					calc = 0;
					num++;
					}
				
				else
					{
					right = true;
					}
			}
		return num;
	}
	
	public static int SumSquareDifference()
		{
			int num1 = 0,num2 = 0,result=0;
			for (int i=0 ; i<=100 ; i++)
				{
				num1=num1+i*i;
				num1 += i;
				}
			result = ((num2*num2)-num1);
			return result;
		}
	
	public static int LongestCollatzSequence()
	{
		int max=0, stepper=0;
		for (int a=99000; a<900000; a++)
			{
				int count=0, module=a;
				while (module!= 1)
					{
						if (module%2==0)
							{
							module=module/2;
							}
						
						else
							{
							module=2*module+1;
							}
						count++;
					}
				
				if (count > max)
					{
					max = count;
					stepper=a;
					}
				
			}
		
		return stepper;
	}
}
