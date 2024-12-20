package static2.ex;

public class MathArrayUtils {
    private static int sum = 0;

    private MathArrayUtils(){
        //인스턴스 생성 막기
    }
    public static int sum(int[] values){
        for(int value : values){
            sum += value;
        }
        return sum;
    }

    public static double average(int[] values) {
        return (double) sum / values.length;
    }

    public static int min(int[] values){
        int min = values[0];
        for (int value : values) {
            if(value < min){
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
