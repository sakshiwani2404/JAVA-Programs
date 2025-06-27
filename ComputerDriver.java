class CPU
{
	String brand;
	int cores;
	double frequency;

	CPU(String brand, int cores, double frequency)
	{
		super();
		this.brand=brand;
		this.cores=cores;
		this.frequency=frequency;
	}
	void displayCPU()
	{
		System.out.println();
		System.out.println("CPU Info :");
		System.out.println("Brand : "+this.brand);
		System.out.println("Cores : "+cores);
		System.out.println("Frequency : "+frequency);
	}
}
class RAM
{
	int size;
	String type;

	RAM(int size, String type)
	{
		super();
		this.size=size;
		this.type=type;
	}
	void displayRAM()
	{
		System.out.println();
		System.out.println("RAM Info :");
		System.out.println("Size : "+this.size);
		System.out.println("Type : "+this.type);
		
	}

}
class HardDrive
{
	int capacityGB;
	String type;

	HardDrive(int capacityGB,String type)
	{
		super();
		this.capacityGB=capacityGB;
		this.type=type;
	}
	void displayHardDrive()
	{
		System.out.println();
		System.out.println("HardDrive Info :");
		System.out.println("Capacity in GB : "+this.capacityGB);
		System.out.println("Type : "+this.type);
	}
}
class Computer
{
	CPU cpu;
	RAM ram;
	HardDrive hardDrive;

	Computer(CPU cpu, RAM ram, HardDrive hardDrive)
	{
		super();
		this.cpu= cpu;
		this.ram=ram;
		this.hardDrive=hardDrive;
	}
	void displayComputer()
	{
		System.out.println("Computer  Info : ");
		cpu.displayCPU();
		ram.displayRAM();
		hardDrive.displayHardDrive();
	}

}
class ComputerDriver
{
	public static void main(String[] args) 
	{	
		Computer computer= new Computer(new CPU("Intel",4,3.5), new RAM(16,"DDR4"), new HardDrive(512,"SSD"));
		computer.displayComputer();
	}

}