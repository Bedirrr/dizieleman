import java.util.Arrays;
import java.util.Scanner;

public class dizieleman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.printf("%d elemanı giriniz:%n", size);
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("Dizinin sıralanmış hali: " + Arrays.toString(array));
    }
}