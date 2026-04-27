import java.util.Arrays;
import java.util.List;

//숫자 타입(Integer, Double 등)의 리스트를 받아서 합계를 계산하는 공통 메소드를 만들겠다
public class BoundedWildcardExample {
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3);

        System.out.println("Sum of intList: " + sumOfList(intList));     // Sum of intList: 6.0
        System.out.println("Sum of doubleList: " + sumOfList(doubleList)); // Sum of doubleList: 6.6
    }
}


