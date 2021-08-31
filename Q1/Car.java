public class Car
{
	private int noTire;
	private int noDoor;
	private int noMirror;
	
	Car()
	{
		super();
	}
	
	Car(int noTire)
	{
		this.noTire = noTire;
	}
	
	Car(int noTire, int noDoor)
	{
		this.noTire = noTire;
		this.noDoor = noDoor;
	}
	
	
	Car(int noTire, int noDoor, int noMirror)
	{
		this.noTire = noTire;
		this.noDoor = noDoor;
		this.noMirror = noMirror;
	}
	
	public void setNo_tire(int no_tire)
	{
		this.noTire = noTire;
	}
	
	public void setNoDoor(int noDoor)
	{
		this.noDoor = noDoor;
	}
	
	public void setNoMirror(int noMirror)
	{
		this.noMirror = noMirror;
	}
	
	public int getNoTire()
	{
		return noTire;
	}
	
	public int getNoDoor()
	{
		return noDoor;
	}
	
	public int getNoMirror()
	{
		return noMirror;
	}
	
}