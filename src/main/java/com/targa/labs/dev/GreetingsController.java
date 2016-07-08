package com.targa.labs.dev;

import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nebrass Lamouchi <lnibrass at gmail.com>
 */
@RestController
public class GreetingsController {

    @Value("${greetings.separator}")
    private String separator;

    @RequestMapping(path = "/time", method = GET)
    public String sayHelloWorld() {
        return String.format("Hello World %s %s", separator, LocalTime.now());
    }

}
