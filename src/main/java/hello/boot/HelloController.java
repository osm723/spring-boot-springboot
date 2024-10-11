package hello.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-spring")
    public String hellSpring() {
        System.out.println("HelloController.hellSpring");
        return "hello Spring!";
    }
}
