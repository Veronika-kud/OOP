package LR_4;

public class Server extends ComputerTechnology
{
	private String serverInterface;
	private String RAIDController;
	
	public Server (String Model, int Production_Year, int Price, String serverInterface, String RAIDController)
	{
		super(Model, Production_Year, Price);
		this.serverInterface = serverInterface;
		this.RAIDController = RAIDController;
	}
	
	public String getServerInterface() {return serverInterface;}
	public String getRAIDController() {return RAIDController;}
	
	public void display()
	{
		System.out.printf("������ �������: %s \n"
				+ "���� ������������: %s \n"
				+ "RAID ����������: %s \n"
				+ "������� ���������: %s \n"
				+ "����: %s", super.getModel(), super.getProduction_Year(),
				RAIDController, serverInterface, super.getPrice());
	}
}
