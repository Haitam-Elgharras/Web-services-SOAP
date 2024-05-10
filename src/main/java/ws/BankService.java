package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "BankWs")
public class BankService {

    @WebMethod(operationName = "ConversionEuroToDH" )
    public double conversion(double amount) {
        return amount * 11;
    }

    @WebMethod
    public compte getCompte(int id) {
        return new compte(id, Math.random()*6000, new Date());
    }

    @WebMethod
    public List<compte> listComptes() {
        return List.of(
                new compte(1, Math.random()*6000, new Date()),
                new compte(2, Math.random()*6000, new Date()),
                new compte(3, Math.random()*6000, new Date())
        );
    }

}
