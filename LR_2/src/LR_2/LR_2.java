package LR_2;

import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Vector;

public class ������ {

	Hashtable<Kontragent, Vector<������>> ������� = 
			new Hashtable<Kontragent, Vector<������>>();
	private ������() { }
	public static ������ �������������() 
	{
		������ data = new ������();
		
		Kontragent ����� = new Kontragent();
		�����.��� = "001";
		�����.fio = "������� �.�.";
		�����.volume = 150;
		�����.cash = 250;
		�����.debit = 800;
		�����.������ = ������_������������.�����������������;
		�����.��������� = ���������.����_�����������;
		data.�������.put(�����, new Vector<>());
		
		����� = new Kontragent();
		�����.��� = "002";
		�����.fio = "������ �.�.";
		�����.volume = 200;
		�����.cash = 350;
		�����.debit = 0;
		�����.������ = ������_������������.������������;
		�����.��������� = ���������.�����������_����������;
		data.�������.put(�����, new Vector<>());
		
		����� = new Kontragent();
		�����.��� = "003";
		�����.fio = "�������� �.�.";
		�����.volume = 50;
		�����.cash = 100;
		�����.debit = 300;
		�����.������ = ������_������������.������������;
		�����.��������� = ���������.����_�����������;
		data.�������.put(�����, new Vector<>());
		return data;
	}
	public void ������()
	{
		�������.entrySet().stream().forEach(e->{
			Kontragent worker = e.getKey();
			System.out.println( worker.���  + "\n" + worker.fio + "\n");
		});
	}
	public void Info(String code)
	{
		Optional<Entry<Kontragent, Vector<������>>> find = �������.entrySet().stream()
				.filter(e->e.getKey().���.equals(code)).findFirst();
		if (find.isPresent())
		{
			System.out.println("���: " + find.get().getKey().fio + "\n" +
					"��������� ������: " + String.valueOf(find.get().getKey().volume) + "\n" + 
					"����������� �������: " + String.valueOf(find.get().getKey().cash) + "\n" +
					"��������� �������������: " + String.valueOf(find.get().getKey().debit) + "\n" +
					"����� ������ �����������: " + String.valueOf(find.get().getKey().������) + "\n" +
					"������� ����������� �� ������ ������: " + String.valueOf(find.get().getKey().���������) + "\n");
		}
		else 
		{
			System.out.println("������, ������� ����� ���������");
		}}
		public void ������_������(String ���_�����������, ������ ������)
		{
			Optional<Entry<Kontragent, Vector<������>>> find = �������.entrySet().stream()
					.filter(e->e.getKey().���.equals(���_�����������)).findFirst();
			if (find.isPresent())
			{
				if(find.get().getKey().��������� == ���������.�����������_����������)
				{
					find.get().getKey().��������� = ���������.����_�����������;
					find.get().getValue().add(������);
					System.out.println("���� ������ �������");
				}
				else System.out.println("�������� �������");}
			else 
			
				System.out.println("������, ������� ����� ���������");
			
		}
	}

