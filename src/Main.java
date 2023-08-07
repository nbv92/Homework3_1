//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		task1();
		task2();
		task3();
		task4();
		task5();
		task6();
		task7();
	}
	
	public static void task1() {
		System.out.println("Task 1");
		//System.out.println("Please, enter age\n");
		//Scanner in = new Scanner(System.in);
		int age = 18; //in.nextInt();// интересно как проверить являеться ли введеные символы числом? Или при символе программа выдаст ошибку?
		if (age>=18){
			System.out.printf("Если возраст человека равен %d, то он совершеннолетний\n",age);
		} else {
			System.out.printf("Если возраст человека равен %d, то он не достиг совершеннолетия, нужно подождать\n", age);
		}
		//in.close();
	}
	
	public static void task2() {
		System.out.println("Task 2");
		//System.out.println("Please, enter temperature\n");
		//Scanner in = new Scanner(System.in);
		double temperature = 5.5;//in.nextDouble();
		if(temperature>=5) {
			System.out.printf("На улице %f градусов тепла, можно идти без шапки\n", temperature);
		}else {
			System.out.printf("На улице %f градусов, нужно надеть шапку\n",temperature);
		}
		//in.close();
	}
	
	public static void task3() {
		System.out.println("Task 3");
		//System.out.println("Please, enter temperature");
		//Scanner in = new Scanner(System.in);
		int speed = 65; //in.nextInt();
		if(speed<=60) {
			System.out.println("Если скорость "+speed+ " то можно ездить спокойно");
		}else {
			System.out.println("Если скорость "+speed+ " то придется заплатить штраф");
		}
		
	}
	
	public static void task4() {
		System.out.println("Task 4");
		int age = 0;
		if(age<=2) {
			System.out.println("Если человеку меньше " + age + " то ему пора спать");
		}
		else if(age>=2&&age<=6) {
			System.out.println("Если человеку от 2 до 6 лет, то ему нужно ходить в детский сад");
		}
		else if(age>6&&age<=18) {
			System.out.println("Если человеку от 7 до 18 лет, то ему нужно ходить в школу");
		}
		else if(age>18&&age<=24) {
			System.out.println("Если человеку больше 18 лет, но меньше 24, то его место в университете");
		}
		else if(age>24&&age<60) {
			System.out.println("А если человеку больше 24, то ему пора ходить на работу");
		}
		else {
			System.out.println("А если человеку больше 60, то он может отдохнуть.");
		}
	}
	
	public static void task5() {
		System.out.println("Task 5");
		int age = 9;
		if (age<=5) {
			System.out.println("Если возраст ребенка равен "+age+" то ему нельзя кататься на аттракционе" );
		}
		else if (age>=5&&age<14) {
			System.out.println("Если возраст ребенка равен "+age+" то ему можно кататься на аттракционе в сопровождении");
		}
		else {
			System.out.println("Если возраст ребенка равен "+age+" то ему без сопровождения взрослого");
		}
	}
	
	public static void task6() {
		System.out.println("Task 6");
		int seatPlace = 60;
		int freePlace = 102;
		int man = 80;
		if (man<seatPlace) {
			System.out.println("Количество человек "+ man + ", всем хватило сидячих мест. Количество свободных мест \n сидячих: " +(seatPlace-man) + "\nстоячих: "+(freePlace-seatPlace)+ ".\n");
		}
		else if (man>seatPlace&&man<freePlace) {
			System.out.println("Количество человек "+ man + ", все поместились в вагон. Количество свободных стоячих мест: " +(freePlace-man)+ ".");
		}
		else if (man>freePlace) {
			System.out.println("Количество человек "+ man + ", в вагоне мест. Не поместилось: " +(man-freePlace)+ ".");
		}
		else {
			System.out.println("System error");
		}
	}
	
	public static void task7() {//решил немного усложнить себе задачу
		System.out.println("Task 7");
		//System.out.println("Please, enter age\n");
		//Scanner in = new Scanner(System.in);
		double mass[]= new double[10];
		for(int i = 0; i < 10; i++) {
		mass[i]= Math.random();
		System.out.print(mass[i] + " ");
		}
		System.out.println(" ");
		double max = mass[0];
		for (int i = 0; i < 10; i++) {
			if(max<mass[i]) {
				max = mass[i];
			}
		}
		System.out.println("Max number: "+ max);
	}
}
