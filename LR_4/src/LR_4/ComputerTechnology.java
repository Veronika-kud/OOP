package LR_4;

public class ComputerTechnology 
{
    private String Model;
    private int Price;
    private int Production_Year;
    
    public String getModel() {return Model; }
    public int getProduction_Year() {return Production_Year; }
    public int getPrice() {return Price; }
    
    public ComputerTechnology (String Model, int Production_Year, int Price)
    {
    	this.Model = Model;
    	this.Production_Year = Production_Year;
    	this.Price = Price;
    }
    
    public void display(){
        
        System.out.printf("Модель: %s/n"
        		+ "Год производства: %s\n"
        		+ "Цена: %s");
    }
}
