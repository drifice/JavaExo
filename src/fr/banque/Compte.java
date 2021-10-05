package fr.banque;

public class Compte {
    private double solde;
    private int numero;

    public Compte() {
    }

    public Compte(double solde, int numero) {
        this.solde = solde;
        this.numero = numero;
    }

    public void ajouter(double unMontant){
        this.setSolde(unMontant);
    }

    public void retirer(double unMontant){
        this.setSolde(unMontant);
    }


    public double getSolde() {
        return solde;
    }

    /*
    on ne peut modifier le solde si on a les droit?
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getNumero() {
        return numero;
    }

    /*
    on ne peut pas modifier le number quand on a pas les droit?
     */
    private void setNumero(int numero) {
        this.numero = numero;
    }
}
