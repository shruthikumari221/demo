import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.Long.parseLong;

@RestController
public class LoggingController {

    Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @RequestMapping("/")
    public String index() throws InterruptedException {
        logger.wait(parseLong("A TRACE Message"));
        logger.error("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.wait(parseLong("An ERROR Message"));

        return "Howdy! Check out the Logs to see the output...";
    }
}

