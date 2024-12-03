package entities;

public class AreaGeografica {
	private int area;
	private String bioma;
	private double temperatura;
	
	public AreaGeografica(int area, String bioma,double temperatura)
	{
		if(area <= 0)
		{
			System.out.println("Area inválida!");
		}
		else
		{
			this.area = area;
		}
		
		
		if(temperatura <= 0)
		{
			System.out.println("Temperatura inválida!");
		}
		else
		{
			this.temperatura = temperatura;
		}
		this.bioma = bioma;
	}


	public int getArea() {
		return area;
	}


	public void setArea(int area) {
		this.area = area;
	}


	public String getBioma() {
		return bioma;
	}


	public void setBioma(String bioma) {
		this.bioma = bioma;
	}


	public double getTemperatura() {
		return temperatura;
	}


	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}
	
	
	
	
	
}
