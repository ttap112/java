package blackBox;

public class _09_GetterSetter {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "까망이";
        b1.price = 200000;
        b1.color = "블랙";

        // 할인 행사
        b1.price = -50000;
        System.out.println("가격 : "+ b1.price + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resolution);

        BlackBox b2 = new BlackBox();

        b2.setModelName("하양이");
        b2.setPrice(-50000);
        b2.setColor("흰색");

        System.out.println("----------------------------------");
        System.out.println("b2의 이름은 : "+b2.getModelName()+"입니다.");
        System.out.println(b2.getModelName()+"의 가격은 "+b2.getPrice()+"입니다.");
        System.out.println(b2.getModelName()+"의 해상도 "+b2.getResolution());
        System.out.println(b2.getModelName()+"의 색상은 "+b2.getColor()+"입니다.");
        System.out.println("----------------------------------");
    }
}
