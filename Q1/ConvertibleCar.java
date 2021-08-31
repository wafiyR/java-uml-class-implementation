public class ConvertibleCar extends Car
{
	private Car car;
	
	ConvertibleCar()
	{
	}
	
	ConvertibleCar(Car car)
	{
		this.car = car;
	}
	
		public Car getCar()
	{
		return car;
	}
	
	public void carInformation()
	{
		System.out.println("This is Convertible Car");
	}
}