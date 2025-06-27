class Mobile
{
	String brand;
	String model;
	String color;
	int ram;
	double price;
	int cameraMP;
	String battery;
	Processor processor;
	SimCard sim;
	Charger charger;
	PowerBank powerbank;
	HeadPhone headphone;
	Mobile()
	{

	}

	Mobile(String brand, String model, String color, int ram, double price, int cameraMP, String battery ,Processor processor)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.color=color;
		this.ram=ram;
		this.price=price;
		this.cameraMP=cameraMP;
		this.battery=battery;
		this.processor=processor;
	}
	void displayMobile()
	{
		System.out.println("Mobile Info : ");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("RAM : "+ram);
		System.out.println("Price : "+price+"rs");
		System.out.println("Camera in MP : "+cameraMP+"mp");
		System.out.println("Battery : "+battery+"mah");
	}
	void addSim(String name, long number, String typeg, String type)
	{
		sim=new SimCard(name,number,typeg,type);
	}
	void addHeadPhone(String name, String brand, String type, String color, double price, int drivermm)
	{
		headphone=new HeadPhone(name,brand,type,color,price,drivermm);
	}
	void addCharger(String type, int power, int watt, double price)
	{
		charger= new Charger(type,power,watt,price);
	}
	void addPowerBank(int mah,int ports, double price, String brand, String batteryType, String color)
	{
		powerbank= new PowerBank(mah,ports,price,brand,batteryType,color);
	}
}
class Processor
{
	OS os;
	String name;
	int ports;
	double clockspeed;
	Processor()
	{

	}
	Processor(String name, int ports, double clockspeed,OS os)
	{
		super();
		this.name=name;
		this.ports=ports;
		this.clockspeed=clockspeed;
		this.os=os;
	}
	void displayProcessor()
	{
		System.out.println("Processor Info : ");
		System.out.println("Name : "+name);
		System.out.println("Ports : "+ports);
		System.out.println("Clock Speed : "+clockspeed);
	}

}
class OS
{
	String version;
	String name;
	String type;
	String releaseDate;
	OS()
	{

	}
	OS(String version, String name, String  type, String releaseDate)
	{
		super();
		this.version=version;
		this.name=name;
		this.type=type;
		this.releaseDate=releaseDate;
	}
	void displayOS()
	{
		System.out.println("OS Info : ");
		System.out.println("Version : "+version);
		System.out.println("Name : "+name);
		System.out.println("Type : "+type);
		System.out.println("Release Date : "+releaseDate);
	}

}
class Charger
{
	String type;
	int power;
	int watt;
	double price;
	Charger()
	{

	}
	Charger(String type, int power, int watt, double price)
	{
		super();
		this.type=type;
		this.power=power;
		this.watt=watt;
		this.price=price;
	}
	void displayCharger()
	{
		System.out.println("Charger Info : ");
		System.out.println("Type : "+type);
		System.out.println("Power : "+power);
		System.out.println("Watt : "+watt);
		System.out.println("Price : "+price);
	}

}
class HeadPhone
{
	String name;
	String brand;
	String type;
	String color;
	double price;
	int drivermm;
	HeadPhone()
	{

	}
	HeadPhone(String name, String brand, String type, String color, double price, int drivermm)
	{
		super();
		this.name=name;
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.price=price;
		this.drivermm=drivermm;
	}
	void displayHeadPhone()
	{
		System.out.println("Head Phone Info : ");
		System.out.println("Name : "+name);
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price);
		System.out.println("Driver in MM : "+drivermm);
	}		
}
class PowerBank
{
	int mah;
	int ports;
	double price;
	String brand;
	String batteryType;
	String color;
	PowerBank()
	{

	}
	PowerBank(int mah,int ports, double price, String brand, String batteryType, String color)
	{
		super();
		this.mah=mah;
		this.ports=ports;
		this.price=price;
		this.brand=brand;
		this.batteryType=batteryType;
		this.color=color;
	}
	void displayPowerBank()
	{
		System.out.println("PowerBank Info : ");
		System.out.println("MAH : "+mah);
		System.out.println("Ports : "+ports);
		System.out.println("Price : "+price );
		System.out.println("Brand : "+brand);
		System.out.println("Battery Type : "+batteryType);
		System.out.println("Color : "+color);
	}

}
class SimCard
{
	String name;
	long number;
	String typeg;
	String type;
	SimCard()
	{

	}
	SimCard(String name, long number, String typeg, String type)
	{
		super();
		this.name=name;
		this.number=number;
		this.typeg=typeg;
		this.type=type;
	}
	void displaySimCard()
	{
		System.out.println("Sim Card Info : ");
		System.out.println("Name : "+name);
		System.out.println("Number : "+number);
		System.out.println("Type of G : "+typeg);
		System.out.println("Type of Paying : "+type);
	}

}
class MobileDriver
{
	
		public static void main(String[] args) {
				OS os= new OS("1.5.1","Oxygen","10/04/2025","ANDROID");

	Processor processor=new Processor("Snapdragon",4,4.5,os);
	Mobile mobile= new Mobile("SAMSUNG", "S24","Black",16,100000,200,"6000",processor);

	mobile.displayMobile();
	mobile.processor.displayProcessor();
	mobile.processor.os.displayOS();

	mobile.addSim("VI",9786548674l,"PrePaid","6g");
	mobile.sim.displaySimCard();
	mobile.addHeadPhone("Sony","WH-CH520","wireless","black",4000,25);
	mobile.headphone.displayHeadPhone();

	mobile.addCharger("C",20,65,3000);
	mobile.charger.displayCharger();

	mobile.addPowerBank(10000,4,3000,"Apple","Lithium","Grey");
	mobile.powerbank.displayPowerBank();
		}

}