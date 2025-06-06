package hello.advanced.app.kim;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KimController {
@RequestMapping("/test")
    public String test(){
    return "ok";
}
}
