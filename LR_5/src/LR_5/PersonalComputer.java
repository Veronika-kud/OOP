package LR_5;

public class PersonalComputer 
{
	public PersonalComputer(String pModel, String pName, String sMotherBoard, int iMotherBoard, String sMemory, int iMemory, String sVideoGame, int iVideoGame, String sProcessor, int iProcessor, String sRAM, int iRAM)
    {
        Models = pModel;
        Names = pName;
        StringMotherBoard = sMotherBoard;
        IntMotherBoard = iMotherBoard;
        StringMemory = sMemory;
        IntMemory = iMemory;
        StringVideoGame = sVideoGame;
        IntVideoGame = iVideoGame;
        StringProcessor = sProcessor;
        IntProcessor = iProcessor;
        StringRAM = sRAM;
        IntRAM = iRAM;

    }

    private String Models;
    private int Prices;
    private String Names;
    private String StringMotherBoard;
    private int IntMotherBoard;
    private String StringMemory;
    private int IntMemory;
    private String StringVideoGame;
    private int IntVideoGame;
    private String StringProcessor;
    private int IntProcessor;
    private String StringRAM;
    private int IntRAM;
    public void Price(int pPrice)
    {
        Prices = pPrice;
    }
    public void drawObject()
    {
        System.out.print("   -----------------\n" +
                          "   | ____      PC  |\n" +
                          "   | _______       |\n" +
                          "   | ____          |\n" +
                          "   | _________     |\n" +
                          "   -----------------\n");
        System.out.println(Name());
        System.out.println(Model());

    }
    public String Name()
    {
    	return "Персональный Компьютер " + Names + "\n";
    }
    public String Model()
    {
    	if (Prices % 10 == 1)
        {
            return "Модель " + Models + ": " + Prices + " Рубль \n" + "Материнская плата: " + StringMotherBoard + " " + IntMotherBoard + "\nПамять: " + StringMemory + " " + IntMemory + "\nВидеокарта: " + StringVideoGame + " " + IntVideoGame + "\nПроцессор: " + StringProcessor + " " + IntProcessor + "\nОперативная память: " + StringRAM + " " + IntRAM;
        }
        else if (Prices % 10 <= 2 && Prices % 10 >= 4)
        {
            return "Модель " + Models + ": " + Prices + " Рубля \n" + "Материнская плата:" + StringMotherBoard + " " + IntMotherBoard + "\nПамять: " + StringMemory + " " + IntMemory + "\nВидеокарта: " + StringVideoGame + " " + IntVideoGame + "\nПроцессор: " + StringProcessor + " " + IntProcessor + "\nОперативная память: " + StringRAM + " " + IntRAM;
        }
        else return "Модель " + Models + ": " + Prices + " Рублей \n" + "Материнская плата: " + StringMotherBoard + " " + IntMotherBoard + "\nПамять: " + StringMemory + " " + IntMemory + "\nВидеокарта: " + StringVideoGame + " " + IntVideoGame + "\nПроцессор: " + StringProcessor + " " + IntProcessor + "\nОперативная память: " + StringRAM + " " + IntRAM;
    }
}
