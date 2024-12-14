package class1;

public class Rectangle {
    static int width = 5;
    static int height = 8;

    static int calculateArea(){
        return width * height;
    }

    int calculatePerimeter(){
        return 2 * (width + height);
    }

    boolean isSquare(){
        return width == height;
    }
}
