package be.pengo.playground.mockbeans;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleService {

    String createExample() {
        log.info("ExampleService is working..");
        return "example";
    }
}