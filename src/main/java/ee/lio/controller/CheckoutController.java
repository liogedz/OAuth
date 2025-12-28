package ee.lio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CheckoutController {

    @GetMapping
    public String greeting() {
        return "Hey! Without security";
    }

    @GetMapping("/secure")
    public String secureGreeting() {
        return "Securely welcome!";
    }
}
