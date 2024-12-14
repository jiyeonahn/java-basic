package class1;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println("넓이: " + Rectangle.calculateArea());
        System.out.println("둘레 길이: " + rectangle.calculatePerimeter());
        System.out.println("정사각형 여부: " + rectangle.isSquare());
    }

    }