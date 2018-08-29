package quoters;

import java.util.*;
import java.util.stream.Collectors;

public class DataService {
    private static LinkedList<Seller> sellers = new LinkedList<>();
    private static Random random = new Random();

    static {
        int sellersLength = random.nextInt(10) + 1;
        for (int i = 0; i < sellersLength; i++) {
            int ownLength = random.nextInt(20);
            List<Integer> products = new ArrayList<>();
            for (int j = 0; j < ownLength; j++) {
                products.add(random.nextInt(1000000));
            }
            sellers.add(new Seller(products));
        }


        LinkedList<Seller> collect = sellers.stream().
                sorted(Comparator.comparing(Seller::getProfit)).
                collect(Collectors.toCollection(LinkedList::new));
        sellers = collect;
    }

    public static LinkedList<Seller> getSortedSellers() {
        return sellers;
    }

}
