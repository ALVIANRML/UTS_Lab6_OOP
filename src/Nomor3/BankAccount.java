package Nomor3;

class BankAccount {
    private String name;
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

    @Override
    public String toString() {
        return "Your Account:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Balance: $ " + balance;
    }

    public void Credit(int amount){
        balance = balance + amount;
    }

    public void Debit(int amount){
        balance = balance - amount;
    }

    public void TransferTo(BankAccount anotherAccount, int amount) {
        if (amount <= balance) {
            this.Debit(amount);
            anotherAccount.Credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
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
    public int getId() {
        return id;
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