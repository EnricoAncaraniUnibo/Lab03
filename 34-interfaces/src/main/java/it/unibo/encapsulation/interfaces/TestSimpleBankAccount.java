package it.unibo.encapsulation.interfaces;

public class TestSimpleBankAccount {

    private TestSimpleBankAccount() {
        /*
         * Prevents object creation from the outside.
         */
    }

    public static void main(final String[] args) {
        // 1) Creare l' AccountHolder relativo a Andrea Rossi con id 1
        AccountHolder ah1 = new AccountHolder("Andrea", "Rossi", 1);
        // 2) Creare l' AccountHolder relativo a Alex Bianchi con id 2
        AccountHolder ah2 = new AccountHolder("Alex", "Bianchi", 2);
        // 3) Creare i due SimpleBankAccount corrispondenti
        BankAccount ba1 = new SimpleBankAccount(1, 10);
        // 4) Effettuare una serie di depositi e prelievi
        BankAccount ba2 = new SimpleBankAccount(2, 20);
        /*
         * 5) Stampare a video l'ammontare dei due conti e verificare la
         * correttezza del risultato
         */
        System.out.println(ba1.getBalance());
        System.out.println(ba2.getBalance());

        // 6) Provare a prelevare fornendo un id utente sbagliato
        ba1.withdraw(2, 100);

        // 7) Controllare nuovamente l'ammontare
        System.out.println(ba1.getBalance());
        System.out.println(ba2.getBalance());
    }
}
