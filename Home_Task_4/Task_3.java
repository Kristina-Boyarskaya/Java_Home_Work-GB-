/*
Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.Используйте итератор
*/
package Home_Task_4;
import java.util.LinkedList;
import java.util.Iterator;
public class Task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(getRandomNumber());
        list.add(getRandomNumber());
        list.add(getRandomNumber());
        list.add(getRandomNumber());
        list.add(getRandomNumber());
        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while(iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }
        System.out.println("Сумма всех элементов: " + sum);
    }
    public static int getRandomNumber() {
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
