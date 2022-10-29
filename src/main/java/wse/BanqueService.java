package wse;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
//POJO  c une simple class java
//je viens de creer un web service
//mtn je vais deployer un web service cad il me faut un serveur http qui permet d acceder au web service

@WebService(serviceName = "BanqueWS")
public class BanqueService {
   @WebMethod(operationName = "Convert")
   public double conversion(@WebParam(name = "montant") double mt) {
        return mt*10.54;

    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code")int code){
        return new Compte(code,Math.random()*9888,new Date());


    }
    @WebMethod
    public List<Compte> listComptes(){
        return List.of(
                new Compte(1,Math.random()*9888,new Date()),
                new Compte(2,Math.random()*9888,new Date()),
                new Compte(3,Math.random()*9888,new Date())
        );
    }







}



//{}