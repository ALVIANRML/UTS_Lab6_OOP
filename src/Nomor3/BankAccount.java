package Nomor3;

class BankAccount {
    private String name, anotherAccount;
    private int id, balance, amount;

    public BankAccount() {
        name = "";
        balance = 0;

    }

    public void Account() {
        System.out.println("Your Account:\n" +
                "ID: " + id + "\n" +
                "name: " + name);
    }

    public void Account(String keterangan) {
        System.out.println("Your Account:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Balance: $ " + balance);
    }

    public void Credit(){
        balance = balance + amount;
    }

    public void Debit(){
        balance = balance - amount;
    }

    public void Transfer(){

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBalance(){
        return balance;
    }



}