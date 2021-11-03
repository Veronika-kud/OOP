package LR_4;

public class Notebook extends ComputerTechnology
{
	
	private String memory;
	private String nameMemory; 
	
	public Notebook (String Model, int Production_Year, int Price, String memory, String nameMemory)
	{
		super(Model, Production_Year, Price);
		this.memory = memory;
		this.nameMemory = nameMemory;
	}
	
	public String getMemory() {return memory;}
	public String getNameMemory() {return nameMemory;}
	
	public void display()
	{
		System.out.printf("Модель ноутбука: %s \n"
				+ "Дата производства: %s \n"
				+ "Тип памяти: %s \n"
				+ "Объем памяти: %s \n"
				+ "Цена: %s", super.getModel(), super.getProduction_Year(),
				memory, nameMemory, super.getPrice());
	}
	
}
