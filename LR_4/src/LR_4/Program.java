package LR_4;

import java.util.Scanner;

public class Program {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - ����� '�������'\n"
				+ "2 - ����� '������'\n"
				+ "3 - ����� '������������ ���������'\n"
				+ "N - �����");
		System.out.print("������� �����: ");
		int a = sc.nextInt();
		System.out.print("\n");
				
		
		
		switch (a)
		{
			case 1: 
				{
					ComputerTechnology HP = new Notebook("ACER", 2019, 40990, "SSD", "500 Gb");
					HP.display();
				}
				break;
			case 2:
			{
				ComputerTechnology HPE_ProLiant = new Server("HPE ProLiant", 2020, 370680, "1G 4P", "P408i-a");
				HPE_ProLiant.display();
			}
			break;
			case 3:
			{
				System.out.println("������� ������:");
				System.out.print("���������: ");
				String nameProcessor = sc.next();
				
				System.out.print("����� ����������: ");
				String socketProcessor = sc.next();
				
				System.out.print("DDR ����������: ");
				String typeDDRProcessor = sc.next();
				
				System.out.print("������� ����������: ");
				int frequencyProcessor = sc.nextInt();
				
				System.out.print("����������� �����: ");
				String nameMotherBoard = sc.next();
				
				System.out.print("����� ����������� �����: ");
				String socketMotherBoard = sc.next();
				
				System.out.print("DDR ����������� �����: ");
				String typeDDRMotherBoard = sc.next();
				
				System.out.print("������� ����������� �����: ");
				int frequencyRAMMotherBoard = sc.nextInt();
				
				System.out.print("����������: ");
				String nameVideoGame = sc.next();
				
				System.out.print("��� ����������: ");
				String typeVideoGame = sc.next();
				
				System.out.print("�����������: ");
				int bitVideoGame = sc.nextInt();
				
				System.out.print("����� ������ � ����������: ");
				int memoryVideoGame = sc.nextInt();
				
				System.out.print("����������� ������: ");
				String nameRAM = sc.next();
				
				System.out.print("DDR ����������� ������: ");
				String typeDDRRAM = sc.next();
				
				System.out.print("����� ����������� ������: ");
				int memoryRAM = sc.nextInt();
				
				ComputerTechnology Olex = new PersonalComputer
						("Olex", 2020, 98460, nameProcessor, socketProcessor, 
						typeDDRProcessor, frequencyProcessor, nameMotherBoard, socketMotherBoard,
						typeDDRMotherBoard, frequencyRAMMotherBoard, 
						nameVideoGame, typeVideoGame, bitVideoGame, 
						memoryVideoGame, nameRAM, typeDDRRAM, memoryRAM);
				Olex.display();
			}
			break;
			default: break;
		}

	}

}
