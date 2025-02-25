package static2;

import static static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();
        // 정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그러므로 인스턴스처럼 참조값의 개념이 없다.
        // 특정 인스턴스의 기능을 사용하려면 참조값을 알아야 하는데, 정적 메서드는 참조값 없이 호출한다. 따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        staticCall(data3);

        //클래스를 통한 접근
        staticCall();
    }
}
