package LR_2;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class Данные {

	Hashtable<Kontragent, Vector<Клиент>> таблица = 
			new Hashtable<Kontragent, Vector<Клиент>>();
	private Данные() { }
	public static Данные Инициализация() 
	{
		Данные data = new Данные();
		
		Kontragent новый = new Kontragent();
		новый.код = "001";
		новый.fio = "Печорин А.Р.";
		новый.volume = 150;
		новый.cash = 250;
		новый.debit = 800;
		новый.оценка = Оценка_контрагентов.Удовлетворительно;
		новый.состояние = Состояние.Есть_задолжность;
		data.таблица.put(новый, new Vector<>());
		
		новый = new Kontragent();
		новый.код = "002";
		новый.fio = "Онегин С.О.";
		новый.volume = 200;
		новый.cash = 350;
		новый.debit = 0;
		новый.оценка = Оценка_контрагентов.Замечательно;
		новый.состояние = Состояние.Задолжность_отсутсвует;
		data.таблица.put(новый, new Vector<>());
		
		новый = new Kontragent();
		новый.код = "003";
		новый.fio = "Радионов Г.Р.";
		новый.volume = 50;
		новый.cash = 100;
		новый.debit = 300;
		новый.оценка = Оценка_контрагентов.Замечательно;
		новый.состояние = Состояние.Есть_задолжность;
		data.таблица.put(новый, new Vector<>());
		return data;
	}
	public void Список()
	{
		таблица.entrySet().stream().forEach(e->{
			Kontragent worker = e.getKey();
			System.out.println( worker.код  + "\n" + worker.fio + "\n");
		});
	}
	public void Info(String code)
	{
		Optional<Entry<Kontragent, Vector<Клиент>>> find = таблица.entrySet().stream()
				.filter(e->e.getKey().код.equals(code)).findFirst();
		if (find.isPresent())
		{
			System.out.println("ФИО: " + find.get().getKey().fio + "\n" +
					"Налоговые взносы: " + String.valueOf(find.get().getKey().volume) + "\n" + 
					"Поступление средств: " + String.valueOf(find.get().getKey().cash) + "\n" +
					"Налоговая задолженность: " + String.valueOf(find.get().getKey().debit) + "\n" +
					"Общая оценка контрагента: " + String.valueOf(find.get().getKey().оценка) + "\n" +
					"Наличие задолжности на данный момент: " + String.valueOf(find.get().getKey().состояние) + "\n");
		}
		else 
		{
			System.out.println("ошибка, введите номер правильно");
		}}
		public void Подача_заявки(String код_контрагента, Клиент клиент)
		{
			Optional<Entry<Kontragent, Vector<Клиент>>> find = таблица.entrySet().stream()
					.filter(e->e.getKey().код.equals(код_контрагента)).findFirst();
			if (find.isPresent())
			{
				if(find.get().getKey().состояние == Состояние.Задолжность_отсутсвует)
				{
					find.get().getKey().состояние = Состояние.Есть_задолжность;
					find.get().getValue().add(клиент);
					System.out.println("Ваша заявка принята");
				}
				else System.out.println("выберите другого");}
			else 
			
				System.out.println("ошибка, введите номер правильно");
			
		}
	}

