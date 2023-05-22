package kafka.cdc.domain;

import java.util.*;
import kafka.cdc.domain.*;
import kafka.cdc.infra.AbstractEvent;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String customerId;
    private Integer qty;
    private Double price;
    private Long productId;

    public OrderPlaced(Order aggregate) {
        super(aggregate);
    }

    public OrderPlaced() {
        super();
    }
}
