package LR_2;

import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		������ ���_������ = ������.�������������();	
		System.out.println("������������, ������� ���� ��� > ");
		String fio = sc.nextLine();
		Menu.Choose(���_������, sc, fio);
		sc.close();
		System.out.println("������ ���������");
	}

}
