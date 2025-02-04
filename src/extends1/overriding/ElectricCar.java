package extends1.overriding;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("전기차를 빠르게 움직입니다.");
    }

    public void charge(int b, int a){
        System.out.println("충전합니다.");
    }
}
