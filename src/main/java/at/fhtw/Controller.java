package at.fhtw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private Message m = new Message();

//    @GetMapping("/api/message")
//    public long addNumbers(@RequestParam(name="numberOne") int numberOne, @RequestParam(name="numberTwo") int numberTwo) {
//        return m.add(numberOne, numberTwo);
//    }


    @PostMapping("/api/message/set")
    public String set(@RequestParam(name="m") String text) {
        m.set(text);
        return m.sayOK();
    }

    @PostMapping("/api/message/reset")
    public String reset() {
        m.reset();
        return m.sayOK();
    }

    @GetMapping("/api/message")
    public String show() {
        return m.getMessage();
    }
}
