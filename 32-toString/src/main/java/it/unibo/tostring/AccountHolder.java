package it.unibo.tostring;

public class AccountHolder {

    private final String name;
    private final String surname;
    private final int userID;

    public AccountHolder(final String name, final String surname, final int accountID) {
        this.name = name;
        this.surname = surname;
        this.userID = accountID;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getUserID() {
        return this.userID;
    }

    @Override
    public String toString() {
        return (""+this.getName()+" "+this.getSurname()+" "+String.valueOf(this.getUserID()));
    }

    public static void main(final String[] args) {
        System.out.println(new AccountHolder("Alex", "Ghini", 42));
        AccountHolder ah=new AccountHolder("giacomo", "verdi", 150);
        System.out.println(ah.toString());
    }
}
