package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yovaliceroman on 4/28/17.
 */

@RestController
public class ApplicationResource {


    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/")
    public Quote getQuote(){
        Quote quote = restTemplate.getForObject(
                "http://gturnquist-quoters.cfapps.io/api/random", Quote.class);

        return quote;
    }
}
