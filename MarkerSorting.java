import java.util.Scanner;
class Marker
{
	String brand;
	String color;
	double price;
	String type;

	Marker(String brand, String type, double price , String color)
	{
		this.brand= brand;
		this.price=price;
		this.type=type;
		this.color=color;
	}
	Marker(Marker old,String color)
	{
		this.brand=old.brand;
		this.type=old.type;
		this.price=old.price;
		this.color=color;
	}
	public void displayMarker()
	{
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Color : "+color);
		System.out.println();
	}
	
}
class MarkerSorting
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter the size of the Marker Array : ");
		int size= sc.nextInt();
		Marker [] m1= new Marker[size];
		System.out.println("Enter the Brand of the Marker :  ");
		String brand= sc.next();
		System.out.println("Enter the Type of the Marker :  ");
		String type=sc.next();
		System.out.println("Enter the Price of the Marker :  ");
		double price= sc.nextDouble();
		System.out.println("Enter the Color of the 1st Marker :  ");
		String color= sc.next();
		m1[0]=new Marker(brand,type,price,color);
		for(int i=1;i<m1.length;i++)
		{
			System.out.println("Enter the Color for "+(i+1)+" th Marker : ");
			m1[i]=new Marker(m1[0], sc.next());
		}
		sortMarkers(m1);

		for(Marker ele : m1)
			ele.displayMarker();
		// m1= new Marker("Cello","WhiteBoard Marker","Red",20);
		// m2= new Marker(m1,"Blue");
		// m3= new Marker(m1,"Black");
		// m4= new Marker(m1,"Green");
		// m5= new Marker(m1,"Purple");
		// m6= new Marker(m1,"Orange");
		// m7= new Marker(m1,"Pink");
		// m8= new Marker(m1,"Brown");
	}
	public static void sortMarkers(Marker[] m)
	{
		for (int i=1;i<m.length;i++ ) 
		{
			Marker key= m[i];
			int j=i-1;
			while(j>=0 && (key.color).compareTo(m[j].color)<0)
			{
				m[j+1]=m[j];
				j--;
			}
			m[j+1]=key;
			
		}
	}
}