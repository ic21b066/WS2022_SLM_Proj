package at.fhtw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Message m = new Message();

    @PostMapping("/api/message/set")  //http://localhost:8080/api/message/set?m=bla
    public String set(@RequestParam(name="m") String text) {
        m.set(text);
        return m.sayOK();
    }

    @PostMapping("/api/message/reset") //http://localhost:8080/api/message/reset
    public String reset() {
        m.reset();
        return m.sayOK();
    }

    @GetMapping("/api/message") //http://localhost:8080/api/message
    public String show() {
        return m.getMessage();
    }
}
