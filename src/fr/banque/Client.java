package fr.banque;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

public class Client {
    private String nom;
    private String prenom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes= new Compte[5];

    public Client() {
    }

    public Client(String nom, String prenom, Integer age, Integer numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
    }

    public void ajouterCompte(Compte unCompte){
        for (Compte compte : comptes) {
            if(compte == null)
                compte = unCompte;
        }
    }

    public void getComptes(){
        for (int i = 0; i <= comptes.length; i++) {
            System.out.println("Numéro compte : " + comptes[i].getNumero());
            System.out.println("Solde compte : " + comptes[i].getSolde());
        }
    }


    public Compte getCompte(int numeroCompte ){
        for (int i = 0; i <= comptes.length; i++) {
            if(comptes[i].getNumero() == numeroCompte)
                return comptes[i];
        }
        return  null;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(getNom(), client.getNom()) && Objects.equals(getPrenom(), client.getPrenom()) && Objects.equals(getAge(), client.getAge()) && Objects.equals(getNumero(), client.getNumero()) && Arrays.equals(comptes, client.comptes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
}
