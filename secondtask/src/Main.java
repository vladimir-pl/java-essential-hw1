import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Введите длины двух сторон прямоугольника:");
    double firstValue = in.nextDouble();
    double secondValue = in.nextDouble();

    Rectangle rectangle = new Rectangle();
    double area = rectangle.areaCalculator(firstValue, secondValue);
    double perimeter = rectangle.perimeterCalculator(firstValue, secondValue);

    System.out.println("Площадь прямоугольника: " + area);
    System.out.println("Периметр прямоугольника: " + perimeter);

  }

}
