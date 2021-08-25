package pro.sky.java.course1.lesson2;

public class Theme1Lesson2 {

    public static void main(String[] args) {

//	Задача 1
	byte a = 100;
	short b = 3111;
	int c = -35637;
	long d = -474389454l;
	float e = 3.5f;
	double f = -6.935;
	char g = 777;
	boolean h = true;

//	Задача 2
	System.out.println("Задача 2");
	float fstBoxer = 78.2f;
	float secBoxer = 82.7f;
	System.out.println("Общий вес бойцов - " + (fstBoxer+secBoxer) + " кг");
	System.out.println("Разница между весами бойцов - " + (secBoxer-fstBoxer) + " кг");
	System.out.println();

//	Задача 3
	System.out.println("Задача 3");
	float bananas = 80 * 5;
	float milk = 200 / 100 * 105;
	float ice = 2 * 100;
	float eggs = 4 * 70;
	float totalWeightGram = bananas + milk + ice + eggs;
	System.out.println("Всего нужно - " + (totalWeightGram/1000) + " кг продуктов");
	System.out.println();

//	Задача 4
	System.out.println("Задача 4");
	byte fstOption = 7 * 1000 / 250;
	System.out.println("Если сбрасывать 250 г/день, в среднем дней нужно " + fstOption + ".");
	byte secOption = 7 * 1000 / 500;
	System.out.println("Если сбрасывать 500 г/день, в среднем дней нужно " + secOption + ".");
	System.out.println();

//	Задача 5
	System.out.println("Задача 5");
	int salaryYearMaria = 67760 * 12;
	int newSalaryMonthMaria = 67760 + (67760 * 10 / 100);
	int newSalaryYearMaria = newSalaryMonthMaria * 12;

	int salaryYearDenis = 83690 * 12;
	int newSalaryMonthDenis = 83690 + (83690 * 10 / 100);
	int newSalaryYearDenis = newSalaryMonthDenis * 12;

	int salaryYearKristina = 76230 * 12;
	int newSalaryMonthKristina = 76230 + (76230 * 10 / 100);
	int newSalaryYearKristina = newSalaryMonthKristina * 12;

	System.out.println("Раньше Маша получала 67760 руб/мес, теперь " + newSalaryMonthMaria + " руб/мес. " +
			"Итак, годовой доход вырос на " + (newSalaryYearMaria-salaryYearMaria) + " руб/мес.");
	System.out.println("Раньше Денис получал 83690 руб/мес, теперь " + newSalaryMonthDenis + " руб/мес. " +
				"Итак, годовой доход вырос на " + (newSalaryYearDenis-salaryYearDenis) + " руб/мес.");
	System.out.println("Раньше Кристина получала 76230 руб/мес, теперь " + newSalaryMonthKristina + " руб/мес. " +
				"Итак, годовой доход вырос на " + (newSalaryYearKristina-salaryYearKristina) + " руб/мес.");
	System.out.println();

//	Задача 6
	System.out.println("Задача 6");
//	Я назвала переменные по-другому, потому что такие названия у меня были в др.задании.

	short i = 12;
	short j = 27;
	short k = 44;
	short l = 15;
	short m = 9;
	int result = i * (j + (k - l * m));
	result = result * -1;
	System.out.println("Результат = " + result);
	System.out.println();

//	Задача 7
	System.out.println("Задача 7");
//	Я назвала переменные по-другому, потому что такие названия у меня были в др.задании.

	int n = 5;
	int o = 7;
	System.out.println("Сейчас n = " + n + ", o = " + o + ".");
	n = n + o;
	o = n - o;
	n = n - o;
	System.out.println("Новые значения: n = " + n + ", o = " + o + ".");
	System.out.println();

//	Задача 8
	System.out.println("Задача 8");
//	Я назвала переменные по-другому, потому что такие названия у меня были в др.задании.

	byte p = 123;
	System.out.println("p = " + p);
	int q = p / 10 % 10;
	System.out.println("q = " + q);

	}
}
