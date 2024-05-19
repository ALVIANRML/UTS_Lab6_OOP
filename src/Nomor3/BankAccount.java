package Nomor3;

class BankAccount {
    // Atribut privat untuk menyimpan informasi akun bank
    private String name;
    private int id, balance, amount;

    // Konstruktor default untuk menginisialisasi nilai default
    public BankAccount() {
        name = "";
        balance = 0;
    }

    // Method untuk menampilkan informasi akun
    public void Account() {
        System.out.println("Your Account:\n" +
                "ID: " + id + "\n" +
                "name: " + name);
    }

    // Method toString untuk menampilkan informasi akun dalam format string
    @Override
    public String toString() {
        return "Your Account:\n" +
                "ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Balance: $ " + balance;
    }

    // Method untuk menambah saldo (kredit) ke akun
    public void Credit(int amount) {
        balance = balance + amount;
    }

    // Method untuk mengurangi saldo (debit) dari akun
    public void Debit(int amount) {
        balance = balance - amount;
    }

    // Method untuk mentransfer saldo ke akun lain
    public void TransferTo(BankAccount anotherAccount, int amount) {
        if (amount <= balance) {
            this.Debit(amount); // Mengurangi saldo dari akun saat ini
            anotherAccount.Credit(amount); // Menambah saldo ke akun tujuan
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Setter untuk mengatur nama pemilik akun
    public void setName(String name) {
        this.name = name;
    }

    // Getter untuk mendapatkan nama pemilik akun
    public String getName() {
        return name;
    }

    // Setter untuk mengatur ID akun
    public void setId(int id) {
        this.id = id;
    }

    // Getter untuk mendapatkan ID akun
    public int getId() {
        return id;
    }

    // Setter untuk mengatur saldo akun
    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Setter untuk mengatur jumlah transaksi terakhir (kredit/debit)
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // Getter untuk mendapatkan saldo akun
    public int getBalance() {
        return balance;
    }
}
