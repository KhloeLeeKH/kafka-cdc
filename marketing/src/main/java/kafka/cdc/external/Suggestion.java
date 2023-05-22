package kafka.cdc.external;

import java.util.Date;
import lombok.Data;

@Data
public class Suggestion {

    private Long id;
    private Long productId;
    private Long suggestProductId1;
    private Long suggestProductId2;
    private Long suggestProductId3;
}
