package lych.new_repo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseEntity hello()
    {
        return ResponseEntity.ok().body("Hello feauture_1");
    }
}
