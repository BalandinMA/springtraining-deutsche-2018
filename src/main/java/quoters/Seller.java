package quoters;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class Seller {
    @Setter
    @Getter
    @InjectSeller
    private List<Integer> products;

    public long getProfit() {
        long sum = products.stream().mapToInt(Integer::valueOf).sum();
        return sum;
    }
}
