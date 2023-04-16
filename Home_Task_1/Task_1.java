// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
// Перейти по ссылке, реализовать формулу на Java.

package Home_Task_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введите N тругольного числа: ");
    int n = sc.nextInt(); 
    int result = (n * (n + 1)) / 2;
    System.out.println(result);
    sc.close();
    }
}