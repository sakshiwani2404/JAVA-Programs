class Bag
{
	String brand;
	String type;
	double litre;
	int comp;
	double price;
	String color;
	String material;
	ArrayList<Book>listBook = new ArrayList<>();
	ArrayList<Pen>listPen = new ArrayList<>();
	WaterBottle waterbottle;
	Laptop laptop;
	Bag()
	{

	}
	Bag(String brand, String type, double litre, int comp, double price, String color, String material)
	{
		super();
		this.brand=brand;
		this.type=type;
		this.litre=litre;
		this.comp=comp;
		this.price=price;
		this.color=color;
		this.material=material;
	}
	public void displayBag()
	{
		System.out.println("Bag Details : ");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Litre : "+litre);
		System.out.println("Number of Compartments : "+comp);
		System.out.println("Price : "+price);
		System.out.println("Color :"+color);
		System.out.println("Material : "+material);
	}
	public void addBook(String type, String brand, String size, int pages, double price)
	{
		Book book= new Book(type,brand, size, pages, price);
		listBook.add(book);

		for(Book ele : listBook)
			ele.displayBook();

	}
	public void addPen(String brand, String type, String color, double price)
	{
		Pen pen = new Pen(brand, type, color, price);
		listPen.add(pen);

		for(Pen ele:listPen)
			ele.displayPen();

	}
	public void addWaterBottle(String material, double capacity, String brand, double price)
	{
		waterbottle= new WaterBottle(material, capacity, brand, price);
		waterbottle.displayWaterBottle();
	}
	public void add Laptop(String brand, String model, double price)
	{
		laptop= new Laptop(brand, model, price);
		laptop.displayLaptop();
	}

}
class Book
{
	String type;
	String brand;
	String size;
	int pages;
	double price;
	Book()
	{

	}
	Book(String type, String brand, String size, int pages, double price)
	{
		super();
		this.type=type;
		this.brand=brand;
		this.size=size;
		this.pages=pages;
		this.price=price;
	}
	public void displayBook()
	{
		System.out.println("Book Details : ");
		System.out.println("Type :"+type);
		System.out.println("Brand : "+brand);
		System.out.println("Size : "+size);
		System.out.println("Pages : "+pages);
		System.out.println("Price : "+price);
	}

}
class Pen
{
	String brand;
	String type;
	String color;
	double price;
	Pen()
	{

	}
	Pen(String brand, String type, String color, double price)
	{
		super();
		this.brand=brand;
		this.type=type;
		this.color=color;
		this.price=price;
	}
	public void displayPen()
	{
		System.out.println("Pen Details : ");
		System.out.println("Brand : "+brand);
		System.out.println("Type : "+type);
		System.out.println("Color : "+color);
		System.out.println("Price : "+price );
	}

}
class WaterBottle
{
	String material;
	double capacity;
	String brand;
	double price;
	WaterBottle()
	{

	}
	WaterBottle(String material, double capacity, String brand, double price)
	{
		super();
		this.material=material;
		this.capacity=capacity;
		this.brand=brand;
		this.price=price;
	}
	public void displayWaterBottle()
	{
		System.out.println("Water Bottle Details : ");
		System.out.println("Material : "+material);
		System.out.println("Capacity : "+capacity);
		System.out.println("Brand : "+brand );
		System.out.println("Price : "+price);

	}
}
class Laptop
{
	String brand;
	String model;
	double price;
	Laptop()
	{

	}
	Laptop(String brand, String model, double price)
	{
		super();
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	public void displayLaptop()
	{
		System.out.println("Laptop Details : ");
		System.out.println("Brand : "+brand );
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
	}
}
class BagDriver
{
	public static void main(String[] args) {
		Bag bag= new Bag();
	}
}