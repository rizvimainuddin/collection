package Collection;
import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        double sum=0.0;
        List <Double> list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floating point values in list till you enter -1");
        double doubleNumber = scanner.nextDouble();
        while(doubleNumber!=-1) {
            list.add(doubleNumber);
            doubleNumber=scanner.nextDouble();
        }
        ListIterator<Double> iterator = list.listIterator();
        while(iterator.hasNext()) {
            sum+=iterator.next();
        }
        System.out.println("Sum of the elements of the list is " +sum);
    }
}