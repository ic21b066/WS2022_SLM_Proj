package at.fhtw;

/*
Quellen:
    https://www.tutorialspoint.com/spring_boot/spring_boot_bootstrapping.htm
    https://www.tutorialspoint.com/spring_boot/spring_boot_rest_template.htm
    https://www.jetbrains.com/help/idea/preparing-for-rest-development.html
    https://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#getting-started.installing
    https://spring.io/guides/gs/spring-boot/#scratch
    https://spring.io/guides/tutorials/rest/
    https://www.jetbrains.com/help/idea/run-debug-configuration-spring-boot.html#modify-options

Todo:
    variable message übernehmen (ausprobieren ob mit Scanner, String-Analyse, oder ähnlichem funktioniert)
 */

        import org.springframework.boot.SpringApplication;
        import org.springframework.boot.autoconfigure.SpringBootApplication;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//hinzugefügt 1
@RestController
//hinzugefügt 1

public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
    //hinzugefügt 2
    @RequestMapping(value = "/")
    public String ok(){
        return "Everything operates as expected";
    }
    //hinzugefügt 2 --> in Browser localhost:8080 eingeben

    //hinzugefügt 3
    @RequestMapping(value = "/set")
    public String servicecheck(){
        return "Service checks: No power until 5:00 pm";
    }
    //hinzugefügt 3 --> in Browser localhost:8080/set eingeben

}