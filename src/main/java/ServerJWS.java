import jakarta.xml.ws.Endpoint;
import ws.BankService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8585/";
        Endpoint.publish(url, new BankService());
        System.out.println("Web service started at: " + url);
    }
}
