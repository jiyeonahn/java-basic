package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data;
        data = new Data(); //참조대상을 바꿀 수 없음

        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
