package Nomor1;

// Class StarFootballPlayer merupakan subclass dari FootballPlayer yang merepresentasikan pemain bintang
public class StarFootballPlayer extends FootballPlayer {
    private int awards; // Atribut untuk menyimpan jumlah penghargaan yang dimiliki oleh pemain bintang

    // Constructor default untuk membuat objek StarFootballPlayer dengan nilai awal
    public StarFootballPlayer() {
        super(); // Memanggil constructor dari superclass FootballPlayer
        this.awards = 0; // Inisialisasi jumlah penghargaan menjadi 0
    }

    // Method setter untuk mengatur jumlah penghargaan
    public void setAwards(int awards) {
        this.awards = awards;
    }

    // Method getter untuk mendapatkan jumlah penghargaan
    public int getAwards() {
        return awards;
    }

    // Method override dari superclass FootballPlayer untuk menampilkan informasi pemain bintang
    @Override
    public void display() {
        super.display(); // Memanggil method display dari superclass untuk menampilkan informasi dasar pemain
        System.out.println("Jumlah Penghargaan: " + awards); // Menampilkan jumlah penghargaan
    }

    // Method override dari superclass FootballPlayer untuk menampilkan informasi pemain bintang dengan tambahan statistik
    @Override
    public void display(String statistik) {
        super.display(statistik); // Memanggil method display dari superclass untuk menampilkan informasi dasar pemain
        System.out.println("Jumlah Penghargaan: " + awards); // Menampilkan jumlah penghargaan
    }
}
