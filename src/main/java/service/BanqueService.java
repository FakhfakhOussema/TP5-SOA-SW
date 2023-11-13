package service;


import metier.Compte;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.List;
@WebService
public class BanqueService {

    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        return montant * 1.1;
    }

    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        Compte compte1 = new Compte(0001, 500.00, "15/08/2002");
        Compte compte2 = new Compte(0002, 8000.00, "14/08/2010");
        Compte compte3 = new Compte(0003, 120.00, "19/06/2012");

        comptes.add(compte1);
        comptes.add(compte2);
        comptes.add(compte3);

        return comptes;
    }
}


