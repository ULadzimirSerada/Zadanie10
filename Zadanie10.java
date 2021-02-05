public class Zadanie10{
	 public static void main(String[] args) {
/*Задание 10
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/
        int sum = 1;
				//int x;
        for (int x = 10; x <= 15; x++) {
        sum = sum * x;

            // return sum;
        }

        System.out.println(sum);
    }
}
