package classExample;

public class MarketGoods {
    // 바뀌면 안되는 값들은 상수 처리
    public final String name;
    public final int retalPrice;
    private int discountRate;

    public MarketGoods(String name, int retalPrice, int discountRate) {
        this.name = name;
        this.retalPrice = retalPrice;

        // 할인율을 잘못 입력했을 때
        if(discountRate < 0 || discountRate > 100){
            this.discountRate = 0;
        } else {
            this.discountRate = discountRate;
        }
    }

    public MarketGoods(String name, int retalPrice) {
        this.name = name;
        this.retalPrice = retalPrice;
    }

    // getter setter
//    public String getName() {
//        return name;
//    }
//
//    public int getRetalPrice() {
//        return retalPrice;
//    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    // 할인율 계산
    public int getDisountPrice(){
        return retalPrice * (100-discountRate) / 100;
    }
}
