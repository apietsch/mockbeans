package be.pengo.playground.mockbeans;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RunAtStartTime implements ApplicationRunner{

    private UserOfService userOfService;

    public RunAtStartTime(UserOfService userOfService) {
        this.userOfService = userOfService;
    }

    @Override
    public void run (ApplicationArguments context) {
        log.info("RunAtStartTime is working ..");
        // userOfService.useExampleService();
    }
}
