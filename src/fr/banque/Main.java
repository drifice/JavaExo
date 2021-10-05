package fr.banque;

import com.company.formation.Point3D;

public class Main {

    public static void main(String[] args) {
        Compte compte = new Compte();
        Client client = new Client();
        client.ajouterCompte(compte);
        System.out.println("compte " + compte.getNumero() + compte.getNumero());
    }
}
