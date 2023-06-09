package kafka.cdc.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "marketing", url = "${api.url.marketing}")
public interface SuggestionService {
    @RequestMapping(method = RequestMethod.POST, path = "/suggestions")
    public void analyzePattern(@RequestBody Suggestion suggestion);
}
