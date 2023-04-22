/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */

package Home_Task_3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task_3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Земля");

        System.out.println("Список планет: " + planets);
        Map<String, Integer> planetCount = new HashMap<>();
        for (String planet : planets) {
            Integer count = planetCount.get(planet);
            if (count == null) {
                count = 0;
            }
            planetCount.put(planet, count + 1);
        }
        for (String planet : planetCount.keySet()) {
            System.out.println(planet + " повторяется " + planetCount.get(planet) + " раз(а)");
        }
    }
}
