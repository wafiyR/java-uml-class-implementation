package bean;

public class Address
{
	private int number;
	private String road;
	private int poscode;
	private String state;
	private int no_tel;
	
	
	public Address(int number, String road, int poscode, String state, int no_tel)
	{
		this.number = number;
		this.road = road;
		this.poscode = poscode;
		this.state = state;
		this.no_tel = no_tel;
	}
	
	public int getNumber()
	{
		return number;
	}
	
	public String getRoad()
	{
		return road;
	}
	
	public int getPoscode()
	{
		return poscode;
	}
	
	public String getState()
	{
		return state;
	}
	
	public int getNo_tel()
	{
		return no_tel;
	}
}
