package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        DecoUtil1 utils = new DecoUtil1();
        String deco = utils.deco(s);//객체를 생성하는 의미가 없음
        System.out.println(deco);
    }
}
