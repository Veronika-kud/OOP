package LR_5;

public class Notebook implements IVisual
{
	private String Models;
    private int Prices;
    private String Names;
    
    public void Price(int pPrice)
    {
        Prices = pPrice;
    }
    public void drawObject()
    {
        System.out.print("   -----------------\n" +
                          "   |               |\n" +
                          "   |               |\n" +
                          "   |               |\n" +
                          "   |               |\n" +
                          "   -----------------\n" +
                          "  /                /\n" +
                          " /                /\n" +
                          "/                /\n" +
                          "-----------------\n");
        System.out.print(Name());
        System.out.print(Model());
    }
    
	public String Name() {
		return "Ноутбук " + Names + "\n";
	}
	
	public String Model() {
		if (Prices % 10 == 1)
        {
            return "Модель " + Models + ": " + Prices + " Рубль";
        }
        else if (Prices % 10 == 2 || Prices % 10 == 4 || Prices % 10 == 3)
        {
            return "Модель " + Models + ": " + Prices + " Рубля";
        }
        else return "Модель " + Models + ": " + Prices + " Рублей";
	}
	
	public Notebook(String pModel, String pName)
	{
		Models = pModel;
        Names = pName;
	}
	
}
