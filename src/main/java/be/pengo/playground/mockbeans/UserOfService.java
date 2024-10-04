package be.pengo.playground.mockbeans;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserOfService {

    private ExampleService exampleService;

    public UserOfService(ExampleService exampleService) {
        this.exampleService = exampleService;

    }

    String useExampleService() {
        log.info("using service and example service returns: " + exampleService.createExample());
        return exampleService.createExample();
    }
}
