import java.util.Scanner;
import ru.netology.service.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("   Здравствуйте! \nВведите цену товара (в руб.):");
        int price = scanner.nextInt();

        System.out.print("Введите вес товара (в кг.):");
        int weight = scanner.nextInt();

        int total = (int) calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.) составит: " + total);
    }

    public static double calculateCustoms(int price, int weight) {
        double total  = price * 0.01 + weight * CustomsService.Fees_On_Weight;
        return total;
    }
}

