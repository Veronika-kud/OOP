package LR_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask2Edit {
	private ArrayList<Double> aa = new ArrayList<Double>();
	private int N;
	Scanner sc = new Scanner(System.in);

	public void InputArray()
	{
		aa.clear();
		Scanner sc = new Scanner(System.in);
		System.out.print("������� ���������� ����� > ");
		N = sc.nextInt();
		
	}

	public void PrintResult()
	{
		int a;
		int min = 1000000, max = 0;
		ArrayList<Integer> aa = new ArrayList();

		
		for(int i = 0; i < N; i++) {
			System.out.print("������� ����� "+ String.valueOf(i+1) + " > ");
			 a = sc.nextInt();
			 aa.add(a);
		}
		
		for (int i = 0; i < N; i++)
		{
			if (min > aa.get(i))
			{
				min = aa.get(i);
			}
			if (aa.get(i) > max)
			{
				max = aa.get(i);
			}
		}
		System.out.println("������������ �����: " + max);
		System.out.println("����������� �����: " + min);
		System.out.println("������� ������������� � ������������ �����: " + (max-min));
	   
	}
}