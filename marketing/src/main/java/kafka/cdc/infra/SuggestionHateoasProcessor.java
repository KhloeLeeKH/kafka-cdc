package kafka.cdc.infra;

import kafka.cdc.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class SuggestionHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Suggestion>> {

    @Override
    public EntityModel<Suggestion> process(EntityModel<Suggestion> model) {
        return model;
    }
}
