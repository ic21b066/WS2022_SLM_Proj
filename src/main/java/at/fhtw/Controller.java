package at.fhtw;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private final Message m = new Message();

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

    //maps all HTTP operations,  may also use @GetMapping or @RequestMapping(method=GET)
    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, Tester!";
    }
}
