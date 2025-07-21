import java.util.Scanner;
class NumbertoWord
{
	static String [] ones={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
	static String[] elevens={"","Eleven","Twelve","Thirteen","Forteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
	static String[] tens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	static String [] h= {"Hundred","Thousand","Lakh","Crore"};

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Upto 9 Digit Number : ");
		int n=sc.nextInt();
		System.out.println(toWord(n));
	}
	public static String toWord(int n)
	{
		if(n==0) return "Zero";
		String res="";
		for(int i=n,j=0;i!=0; )
		{
			switch(j)
			{
			case 0:
				res=twodgts(i%100)+res;
				i/=100; j+=2;
				break;
			case 2:
				if(i%10!=0)
					res=ones[i%10]+" "+h[0]+" and "+res;
				i/=10;j++;
				break;

			case 3:
				if((i%100)!=0)
					res=twodgts(i%100)+" "+h[1]+" "+res;
				i/=100;j+=2;
				break;

			case 5 :
				if((i%100)!=0)
					res=twodgts(i%100)+" "+h[2]+" "+res;
				i/=100;j+=2;
				break;

			case 7:
				if((i%100)!=0)
					res=twodgts(i%100)+" "+h[3]+" "+res;
				i/=100;j+=2;
				break;

			default:
				i=0;
				break;
			}

		}
		return res;
	}
	public static String twodgts(int n)
	{
		if(n>=11 && n<=19 )
			return elevens[n%10];
		else if(n==10)
			return tens[1];
		else if(n>=20)
			return tens[n/10]+"-"+ones[n%10];
		else if(n>0 &&n<=9)
			return ones[n];
		return "";
	}
	
}