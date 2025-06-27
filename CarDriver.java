class Engine
{
	double bhp;
	int pistons;
	int gears;
	String type;
	double cc;
	Engine(double bhp,int pistons,int gears,String type, double cc)
	{
		super();
		this.bhp=bhp;
		this.pistons=pistons;
		this.gears=gears;
		this.type=type;
		this.cc=cc;
	}
	void displayEngine()
	{
		System.out.println();
		System.out.println("Engine Info:");
		System.out.println("Type : "+type);
		System.out.println("BHP : "+bhp);
		System.out.println("Pistons : "+pistons);
		System.out.println("Gears : "+gears);
		System.out.println("CC : "+cc);

	}
}
class Car
{
	String brand;
	String model;
	String type;
	String color;
	int seatingCap;
	double price;
	Engine engine;
	//Engine engine= new Engine(34,2,5,"SI",800);

	Car(String brand, String model, String type, String color, int seatingCap, double price/*,Engine engine*/ )
	{
		super();
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.color=color;
		this.seatingCap=seatingCap;
		this.price=price;
		//this.engine=engine;
		this.engine=new Engine(34,2,5,"SI",800);
	}
	void displayCar()
	{
		System.out.println("Car Info:");
		System.out.println("Brand :"+ brand);
		System.out.println("Model :"+ model);
		System.out.println("Type :"+ type);
		System.out.println("Color :"+color);
		System.out.println("Seating Capacity :"+seatingCap);
		System.out.println("Price : "+price);

	}

}
class CarDriver
{
	public static void main(String[] args) 
	{
		 Car car= new Car("Maruti","Omni","Van","White",10,350000);
		//Car car= new Car("Maruti","Omni","Van","White",10,350000,new Engine(34,2,5,"SI",800));
		car.displayCar();
		car.engine.displayEngine();
	}
}