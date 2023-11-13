package serveur;

import jakarta.xml.ws.Endpoint;
import service.BanqueService;

public class ServeurJSW {
    public static void main(String[] args) {
        // Crée une instance de la classe CalculatriceWS, qui est le service web que vous souhaitez publier.
        BanqueService banqueService = new BanqueService();

        String url = "http://localhost:8085/BanqueService";


        Endpoint.publish(url,banqueService);

        // Affiche l'URL du service web publié.
        System.out.println("Server url: " + url);
    }
}