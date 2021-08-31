public class PremiumCar extends Vehicle
{
	private int sizeTire;
	private String brand;
	private int noTire;
	private int noDoor;
	
	PremiumCar()
	{
		super();
	}
	
	PremiumCar(int noTire, int sizeTire)
	{
		this.noTire = noTire;
		this.sizeTire = sizeTire;
	}
	
	PremiumCar(String brand, int noTire, int noDoor)
	{
		this.brand = brand;
		this.noTire = noTire;
		this.noDoor = noDoor;
	}
	
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	public void setSizeTire(int sizeTire)
	{
		this.sizeTire = sizeTire;
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public int getSizeTire()
	{
		return sizeTire;
	}
	
	public int getNoTire()
	{
		return noTire;
	}
	
	public void carInformation()
	{
		System.out.println("This is Standard Car");
	}
	
}