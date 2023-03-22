import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    try (Scanner inputNumber = new Scanner(System.in)) {
      System.out.print("insira um número: ");

      int number = inputNumber.nextInt();

      for (int i = 1; i <= number; i++) {
        for (int j = 0; j < i; j++) {
          System.out.print(i);
        }
        System.out.println();
      }
    }
  }
}