public class MyApp
{
	public static void main(String [] args)
	{
		Car carObj = new Car(4, 4, 4);
		ConvertibleCar myConvertibleCar = new ConvertibleCar(carObj);
		Car myCar = myConvertibleCar.getCar();
		
		int tire = myCar.getNoTire();
		System.out.println("No of Tires : " + tire);
		
		int door = myCar.getNoDoor();
		System.out.println("No of Doors : " + door);
		
		int mirror = myCar.getNoMirror();
		System.out.println("No of Mirrors : " + mirror);
		
		myConvertibleCar.carInformation();
		
		PremiumCar premiumCar = new PremiumCar("Proton Saga", 4, 4);
		premiumCar.carInformation();
		String brand = premiumCar.getBrand();
		System.out.println("Brand of Car: " + brand);
		System.out.println("Size of Tire: " + premiumCar.getSizeTire());
		System.out.println("Number of Tire: " + premiumCar.getNoTire());
	}
}