
import static java.lang.Integer.bitCount;

public class Exercise {

    public static String Calculate(int a, int b) {
        //створення масиву для злих чисел
        StringBuilder array = new StringBuilder();
        //цикл з перевіркою, чи кількість бітів числа парна
        for (int i = a; i <= b; i++) {
            if (bitCount(i)%2==0) {
                //додавання потрібних чисел до масиву
                array.append(i).append(", ");
            } 
        }
        //прибирання в кінці масиву коми
        array.setLength(array.length() - 2);
        return array.toString();
    }

}
