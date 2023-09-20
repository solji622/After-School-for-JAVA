package classExample;

public class MarketMain {
    public static void main(String[] args) {
        MarketGoods g1 = new MarketGoods("Macbook Air", 1950000);
        MarketGoods g2 = new MarketGoods("Macbook Pro", 2950000, 15);
        MarketGoods g3 = new MarketGoods("Iphone 14", 920000, 20);

        System.out.println(g1.name + "의 할인율: " + g1.getDiscountRate() + "%");
        System.out.println(g2.name + "의 할인율: " + g2.getDiscountRate() + "%");
        System.out.println(g3.name + "의 할인율: " + g3.getDiscountRate() + "%");
        System.out.println(g3.name + "의 정상가격: " + g3.retalPrice + "원");
        System.out.println(g3.name + "의 할인가격: " + g3.getDisountPrice() + "원");

        System.out.println("경쟁 업체가 많아져서 " + g3.name + "의 할인율이 35%로 올랐습니다.");
        g3.setDiscountRate(35);
        System.out.println(g3.name + "의 할인율: " + g3.getDiscountRate() + "%");
        System.out.println(g3.name + "의 정상가격: " + g3.retalPrice + "원");
        System.out.println(g3.name + "의 할인가격: " + g3.getDisountPrice() + "원");



    }

}
