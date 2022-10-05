
import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class Main {
    public static void main (String[] args){
        System.out.println("Starting REST Service");

        //Infrastructure: video 5 ca mitte
        ResourceConfig rc = new ResourceConfig().packages("at.fhtw");
        HttpServer server = JdkHttpServerFactory.createHttpServer(URI.create("http://localhost:8080/"), rc);
        System.out.println("Server started");

        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        server.stop(0);
        System.out.println("Server stopped");
    }
}
