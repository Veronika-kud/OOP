package LR_5;

public class Program 
{

	public static void main (String[] args)
	{
		Notebook N = new Notebook("Acpire 3", "ACER");
		N.Price(40990);
		N.drawObject();
		
		System.out.println("\n");
		
		Server S = new Server("WDBKWB0160KBK-EEUE", "WD");
        S.Price(103000);
        S.drawObject() ;

        System.out.println("\n");

        PersonalComputer P = new PersonalComputer("Своя", "Olex", "ASRock", 25000, "Samsung", 1200, "MSI GeForge RTX 2060", 80990, "Intel Core I9", 60000, "Kingdom", 3900);
        P.Price(250000);
        P.drawObject();
		
	}
}
