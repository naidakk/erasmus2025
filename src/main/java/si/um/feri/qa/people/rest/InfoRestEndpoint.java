package si.um.feri.qa.people.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoRestEndpoint {

    @GetMapping("/info")
    public String infoMethod() {
        System.out.println("Info method was invoked.");
        return "info";
    }

}
