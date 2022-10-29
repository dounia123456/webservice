import jakarta.xml.ws.Endpoint;
import wse.BanqueService;
// le WSDL est un fichier xml qui permet de faire la decsription d un web service

// pour consommer un webservice je dois savoir le wsdl wt l adresse et biensure le type

public class ServerJWS {
    public static void main(String[] args) {
        // c une classe de jaxws
        // c un connecteur http pour le web service
        // publish permet de demarrer un serveur http qui va utiliser le port 9191
        // localhost cad webservice n est accessible qu en local
        Endpoint.publish("http://0.0.0.0:9191/", new BanqueService());
        System.out.println("Web Service est deployé sur http://0.0.0.0:9191");
    }
}


//{}
