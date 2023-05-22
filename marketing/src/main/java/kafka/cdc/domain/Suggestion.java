package kafka.cdc.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import kafka.cdc.MarketingApplication;
import lombok.Data;

@Entity
@Table(name = "Suggestion_table")
@Data
public class Suggestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long productId;

    private Long suggestProductId1;

    private Long suggestProductId2;

    private Long suggestProductId3;

    @PostPersist
    public void onPostPersist() {
        // Get request from Suggestion
        //kafka.cdc.external.Suggestion suggestion =
        //    Application.applicationContext.getBean(kafka.cdc.external.SuggestionService.class)
        //    .getSuggestion(/** mapping value needed */);

    }

    public static SuggestionRepository repository() {
        SuggestionRepository suggestionRepository = MarketingApplication.applicationContext.getBean(
            SuggestionRepository.class
        );
        return suggestionRepository;
    }
}
