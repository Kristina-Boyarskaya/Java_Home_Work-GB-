//2. Вывести все простые числа от 1 до 1000 

package Home_Task_1;
public class Task_2 {
    public static void main(String[] args) {
        int n = 1000;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (isPrime1(i)) {
                System.out.print(i + "\t");
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println(n + count);
    }

    public static boolean isPrime1(int i) {
        boolean t = false;
        if (i == 2) {
            t = true;
        }
        for (int j = 2; j < i; j++) {
            if (j == (i - 1)) {
                t = true;
            }
            if ((i % j) == 0) {
                break;
            }
        }
        return t;
    }
}
