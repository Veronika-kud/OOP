package LR_4;

import java.util.Scanner;

public class Program {
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Класс 'Ноутбук'\n"
				+ "2 - Класс 'Сервер'\n"
				+ "3 - Класс 'Персональный компьютер'\n"
				+ "N - выход");
		System.out.print("Введите число: ");
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
				System.out.println("Введите данные:");
				System.out.print("Процессор: ");
				String nameProcessor = sc.next();
				
				System.out.print("Сокет процессора: ");
				String socketProcessor = sc.next();
				
				System.out.print("DDR процессора: ");
				String typeDDRProcessor = sc.next();
				
				System.out.print("Частота процессора: ");
				int frequencyProcessor = sc.nextInt();
				
				System.out.print("Материнская плата: ");
				String nameMotherBoard = sc.next();
				
				System.out.print("Сокет материнской платы: ");
				String socketMotherBoard = sc.next();
				
				System.out.print("DDR материнской платы: ");
				String typeDDRMotherBoard = sc.next();
				
				System.out.print("Частота материнской платы: ");
				int frequencyRAMMotherBoard = sc.nextInt();
				
				System.out.print("Видеокарта: ");
				String nameVideoGame = sc.next();
				
				System.out.print("Тип видеокарты: ");
				String typeVideoGame = sc.next();
				
				System.out.print("Архитектура: ");
				int bitVideoGame = sc.nextInt();
				
				System.out.print("Объем памяти в видеокарте: ");
				int memoryVideoGame = sc.nextInt();
				
				System.out.print("Оперативная память: ");
				String nameRAM = sc.next();
				
				System.out.print("DDR оперативной памяти: ");
				String typeDDRRAM = sc.next();
				
				System.out.print("Объем оперативной памяти: ");
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
