package LR_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyTask {
	
	public static void DoTask()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите количество чисел > ");
		int N = sc.nextInt();
		
		int a;
		int min = 1000000, max = 0;
		ArrayList<Integer> aa = new ArrayList();

		
		for(int i = 0; i < N; i++) {
			System.out.print("Введите число "+ String.valueOf(i+1) + " > ");
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
		System.out.println("Максимальное число: " + max);
		System.out.println("Минимальное число: " + min);
		System.out.println("Разница максимального и минимального числа: " + (max-min));
	   
	}
}
	