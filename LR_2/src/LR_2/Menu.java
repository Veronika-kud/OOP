package LR_2;

import java.util.Scanner;
public class Menu {

	
	public static void Hi(String fio)
	{
		System.out.println("����������, " + fio + ", ��� ��������� ����������"
				+ "�������� ��������: \n"
				+ "1 - ������ ������������ \n"
				+ "2 - ���������� � ����������� \n"
				+ "3 - ��������� ������ �� ��������� ������ \n"
				+ "4 - ����� �� ������� \n");
	}
	public static void Choose(������ data, Scanner sc, String fio_client)
	{   int �������� = 4;
		do {
			Hi(fio_client);
			�������� = sc.nextInt();
		switch (��������)
		{
		case 1: data.������(); break;
		case 2: System.out.println("������� ����������������� ����� �����������"); 
		String code1 =  sc.next();
		data.Info(code1); break;
		case 3: System.out.println("������� ����������������� ����� �����������"); 
		String code2 =  sc.next(); 
		������ ����� = new ������(fio_client);
		data.������_������(code2, �����); break;
		default: break;}
		} while(�������� !=4);
	}
}
