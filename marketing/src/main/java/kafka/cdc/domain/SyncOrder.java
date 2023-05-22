package kafka.cdc.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kafka.cdc.MarketingApplication;
import lombok.Data;

@Entity
@Table(name = "SyncOrder_table")
@Data
public class SyncOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String customerId;

    private Integer qty;

    private Double price;

    private Long productId;

    public static SyncOrderRepository repository() {
        SyncOrderRepository syncOrderRepository = MarketingApplication.applicationContext.getBean(
            SyncOrderRepository.class
        );
        return syncOrderRepository;
    }
}
