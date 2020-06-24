package Packege;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
            String mercury = new String("Меркурий");
            String venus = new String("Венера");
            String earth = new String("Земля");
            String mars = new String("Марс");
            String jupiter = new String("Юпитер");
            String saturn = new String("Сатурн");
            String uranus = new String("Уран");
            String neptune = new String("Нептун");
//
//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth,
//                mars, jupiter, saturn, uranus, neptune));
//
//        Collections.sort(solarSystem);
//        System.out.println(solarSystem);


//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
//        System.out.println(Collections.max(numbers));
//        System.out.println(Collections.min(numbers));

//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth,
//                mars, jupiter, saturn, uranus, neptune));
//        Collections.sort(solarSystem);
//        Collections.reverse(solarSystem);
//        System.out.println(solarSystem);

//        ArrayList <Integer> lottery = new ArrayList<>(100);
//        for (int i = 1; i <= 100; i++) {
//            lottery.add(i); //добавляем в барабан числа от 1 до 100
//        }
//        Collections.shuffle(lottery); //перемешиваем
//        System.out.println("Внимание! Из барабана появляются первые 10 чисел!");
//        for (int i = 0; i <10; i++) {
//            System.out.println(lottery.get(i));
//        }
//        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
//               jupiter, saturn, uranus, neptune)));
//        solarSystem.add("Плутон"); //попробуем добавить новый элемент

//        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth, mars
//                , jupiter, saturn, uranus, mercury)); // неправильный порядок планет
//        System.out.println(solarSystem);
//
//        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
//        System.out.println(solarSystem);

        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));

        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));

    }
}
