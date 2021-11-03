package LR_3;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask 
{
	public static void DoTask()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество множителей > ");
		int N = sc.nextInt();

		double a, b;
		int max = N;
		double rez = 1.0;
		ArrayList<Double> aa = new ArrayList();
		ArrayList<Double> bb = new ArrayList();

		for (int i = 0; i < N; i++)
		{
			System.out.print("Введите число числитель множителя " + String.valueOf(i+1) + " > ");
			a = sc.nextDouble();
			aa.add(a);
			System.out.print("Введите число знаменателя множителя " + String.valueOf(i+1) + " > ");
			b = sc.nextDouble();
			bb.add(b);
		}

		for (int i = 0; i < N; i++)
		{
			if (i == (max-1))
			{
				System.out.print("(" + aa.get(i) + "/" + bb.get(i) + ")");
			}
			else
			{
				System.out.print("(" + aa.get(i) + "/" + bb.get(i) + ")" + " * ");
			}
		}
		for (int i = 0; i < N; i++)
		{
			rez *= ((aa.get(i))/(bb.get(i)));
		}
		System.out.print(" = " + rez);
	}
}