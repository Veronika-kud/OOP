package LR_4;

public class PersonalComputer extends ComputerTechnology
{
	private String nameProcessor, socketProcessor, typeDDRProcessor;
	private int frequencyProcessor, frequencyRAMMotherBoard;
	private String nameMotherBoard, socketMotherBoard, typeDDRMotherBoard;
	private String nameVideoGame, typeVideoGame;
	private int bitVideoGame, memoryVideoGame;
	private String nameRAM, typeDDRRAM;
	private int memoryRAM;
	
	public PersonalComputer (String Model, int Production_Year, 
			int Price, String nameProcessor, String socketProcessor,
			String typeDDRProcessor, int frequencyProcessor,
			String nameMotherBoard, String socketMotherBoard,
			String typeDDRMotherBoard, int frequencyRAMMotherBoard,
			String nameVideoGame, String typeVideoGame, int bitVideoGame,
			int memoryVideoGame, String nameRAM, String typeDDRRAM,
			int memoryRAM)
	{
		super(Model, Production_Year, Price);
		this.nameProcessor = nameProcessor; this.socketProcessor = socketProcessor; 
		this.typeDDRProcessor = typeDDRProcessor; this.frequencyProcessor = frequencyProcessor; 
		
		this.nameMotherBoard = nameMotherBoard; this.socketMotherBoard = socketMotherBoard;
		this.typeDDRMotherBoard = typeDDRMotherBoard; this.frequencyRAMMotherBoard = frequencyRAMMotherBoard; 
		
		this.nameVideoGame = nameVideoGame; this.typeVideoGame = typeVideoGame; 
		this.bitVideoGame = bitVideoGame; this.memoryVideoGame = memoryVideoGame;
		
		this.nameRAM = nameRAM; this.typeDDRRAM = typeDDRRAM; 
		this.memoryRAM = memoryRAM;
	}
	
	public String getnameProcessor() {return nameProcessor;}
	public String getsocketProcessor() {return socketProcessor;}
	public String gettypeDDRProcessor() {return typeDDRProcessor;}
	public int getfrequencyProcessor() {return frequencyProcessor;}
	
	public String getnameMotherBoard() {return nameMotherBoard;}
	public String getsocketMotherBoard() {return socketMotherBoard;}
	public String gettypeDDRMotherBoard() {return typeDDRMotherBoard;}
	public int getfrequencyRAMMotherBoard() {return frequencyRAMMotherBoard;}
	
	public String getnameVideoGame() {return nameVideoGame;}
	public String gettypeVideoGame() {return typeVideoGame;}
	public int getbitVideoGame() {return bitVideoGame;}
	public int getmemoryVideoGame() {return memoryVideoGame;}
	
	public String getnameRAM() {return nameRAM;}
	public String gettypeDDRRAM() {return typeDDRRAM;}
	public int getmemoryRAM() {return memoryRAM;}
	
	public void display()
	{
			System.out.printf("\nМодель ПК: %s \n"
					+ "Дата сборки: %s \n\n"
					+ "Процессор: %s \n"
					+ "Сокет: %s \n"
					+ "DDR: %s \n"
					+ "Частота: %s \n\n"
					+ "Материнская плата: %s \n"
					+ "Сокет: %s \n"
					+ "DDR: %s \n"
					+ "Частота: %s \n\n"
					+ "Видеокарта: %s \n"
					+ "Тип: %s \n"
					+ "Архитектура: %s \n"
					+ "Объем памяти: %s \n\n"
					+ "Оперативная память: %s \n"
					+ "DDR: %s \n"
					+ "Объем памяти: %s \n\n"
					+ "Цена: %s", super.getModel(), super.getProduction_Year(),
					nameProcessor, socketProcessor, typeDDRProcessor,
					frequencyProcessor, nameMotherBoard, socketMotherBoard,
					typeDDRMotherBoard, frequencyRAMMotherBoard, 
					nameVideoGame, typeVideoGame, bitVideoGame, 
					memoryVideoGame, nameRAM, typeDDRRAM, memoryRAM,
					super.getPrice());
	}
}
