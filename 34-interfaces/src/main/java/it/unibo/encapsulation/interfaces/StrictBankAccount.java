package it.unibo.encapsulation.interfaces;

public class StrictBankAccount implements BankAccount{

    private final int id;
    private double balance;
    private int transactions;
    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    public StrictBankAccount(final int id, final double balance) {
        this.id = id;
        this.balance=balance;
        this.transactions = 0;
    }
    
    public int getid() {
        return this.id;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public int getTransactionsCount() {
        return this.transactions;
    }

    public void setTransactions(final int transactions) {
        this.transactions = transactions;
    }

    public void setBalance(final double balance) {
        this.balance = balance;
    }

    public void incrementTransictions() {
        this.setTransactions(this.getTransactionsCount()+1);
    }

    public void sumBalance(final double balance) {
        this.setBalance(this.getBalance()+balance);
    }

    @Override
    public void withdraw(int id, double amount) {
        if(this.getid() == id) {
            if(this.getBalance()-amount>=0) {
                this.incrementTransictions();
                this.sumBalance(-amount);
            }
            
        }
    }

    @Override
    public void deposit(int id, double amount) {
        if(this.getid() == id) {
            this.incrementTransictions();
            this.sumBalance(amount);
        }
    }

    @Override
    public void depositFromATM(int id, double amount) {
        if(this.getid() == id) {
            if(this.getBalance()+amount-ATM_TRANSACTION_FEE >=0 ) {
                this.incrementTransictions();
                this.sumBalance(amount-ATM_TRANSACTION_FEE);
            }
        }
    }

    @Override
    public void withdrawFromATM(int id, double amount) {
        if(this.getid() == id) {
            if(getBalance() - (amount + ATM_TRANSACTION_FEE) >= 0) {
                this.incrementTransictions();
                this.sumBalance(-(amount+ATM_TRANSACTION_FEE));
            }
        }
    }

    @Override
    public void chargeManagementFees(int id) {
        if(this.getid() == id) {
            if(getBalance() - MANAGEMENT_FEE - (TRANSACTION_FEE * getTransactionsCount()) >= 0) {
                this.setBalance(getBalance() - MANAGEMENT_FEE - (TRANSACTION_FEE * getTransactionsCount()));
            }
        }
    }
}
