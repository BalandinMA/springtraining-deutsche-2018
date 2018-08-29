package quoters;

public class SellersHolder {
    @InjectSeller
    Seller seller1;
    @InjectSeller
    Seller seller2;
    @InjectSeller
    Seller seller3;
    @InjectSeller
    Seller seller4;

    void checkSellers(){
        System.out.println(seller1.getProfit());
        System.out.println(seller2.getProfit());
        System.out.println(seller3.getProfit());
        System.out.println(seller4.getProfit());
    }
}
