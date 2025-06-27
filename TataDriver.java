class Tata
{
	private String companyName;
	private int foundedYear;
	private String founder;
	private String headquarters;
	private double annualRevenue;
	private int totalEmployees;
	private String chairman;
	private String ceo;
	private String country;

	Tata()
	{
		super();
	}
	Tata(String companyName, int foundedYear, String founder, String headquarters, 
		double annualRevenue, int totalEmployees, String chairman, String ceo , String country)
	{
		super();
		this.companyName=companyName;
		this.foundedYear=foundedYear;
		this.founder=founder;
		this.headquarters=headquarters;
		this.annualRevenue=annualRevenue;
		this.totalEmployees=totalEmployees;
		this.chairman=chairman;
		this.ceo=ceo;
		this.country=country;
	}
	public void displayTata()
	{
		System.out.println("Tata Details : ");
		System.out.println("");
	}

}
class LifeStyle extends Tata
{
	private boolean sellsJewellery;
	private boolean sellsWatches;
	private boolean hasOnlinePlatform;
	private double marketShare;
	private String brandAmbassador;
	private int numOfStores;
	private double annualRevenue;


}

class WestSide extends LifeStyle
{
	private String onlinePortal;
	private boolean inMalls;
	private String priceRange;
	private int openHours;
	private boolean standAloneStores;

}
class Zudio extends LifeStyle
{
	String storeType;
	String productCategory;
	boolean hasOnlineDelivery;
	String seasonalCollection;
	String storeAmbience;


}
class Tanishq extends LifeStyle
{
	String jewelleryType;
	boolean sellsGold;
	boolean sellsDiamond;
	boolean offersCustomization;
	String hallMarketCertifications;
	boolean exportsJewellery;
	boolean offersWeddingCollection;

}
class Titan extends LifeStyle
{
	String watchRange;
	boolean sellsEyeWear;
	boolean sellsSmartWatches;
	boolean hasRepairServices;
	String glassMaterial;
	double averageWatchPrice;
	String bandMaterial;
	boolean offersLimitedEditions;

}
class FastTrack extends LifeStyle
{
	boolean sellsAccessories;
	String pricingModel;
	boolean runsAdCampaigns;
	String packagingDesign;
	boolean offersEmiOptions;


}
class Automotive extends Tata
{


}
class TataMotors extends Automotive
{

}
class LandRover extends Automotive
{

}
class Jaguar extends Automotive
{

}
class Food extends Tata
{

}
class TataSalt extends Food
{

}
class TataTea extends Food
{

}
class StarBucks extends Food
{

}
class Technology extends Tata
{

}
class TCS extends Technology
{

}

class Aerospace extends Tata
{

}

class Metals extends  Tata{

}
class TataSteel extends Metals
{

}
class RetailEcommerce extends Tata
{

}
class Croma extends RetailEcommerce
{

}
class TataCliq extends RetailEcommerce
{

}
class StarBazar extends RetailEcommerce
{

}
class BigBasket extends RetailEcommerce
{

}
class Fianance extends  Tata{

}
class TataDriver
{

}



