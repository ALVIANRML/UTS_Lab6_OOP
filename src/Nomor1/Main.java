package Nomor1;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Membuat objek FootballPlayer
        FootballPlayer footballPlayer1 = new FootballPlayer();
        FootballPlayer footballPlayer2 = new FootballPlayer();
        FootballPlayer footballPlayer3 = new FootballPlayer();

        // Membuat objek StarFootballPlayer
        StarFootballPlayer starPlayer = new StarFootballPlayer();

        // Meminta input biodata pemain dari pengguna
        System.out.println("Biodata Pemain: ");
        System.out.print("Masukkan Nama Pemain: ");
        String name = scanner.nextLine();
        footballPlayer1.setName(name);
        starPlayer.setName(name);

        System.out.print("Masukkan Umur Pemain: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline
        footballPlayer1.setAge(age);
        starPlayer.setAge(age);

        System.out.print("Masukkan Klub pemain: ");
        String club = scanner.nextLine();
        footballPlayer1.setClub(club);
        starPlayer.setClub(club);

        System.out.print("Masukkan posisi pemain: ");
        String position = scanner.nextLine();
        footballPlayer2.setPosition(position);
        starPlayer.setPosition(position);

        // Mengenerate nilai acak untuk gaji, gol, assist, dan pertandingan pemain
        int min = 100;
        int max = 300;

        int salary = random.nextInt(max - min + 1) + min;
        footballPlayer2.setSalary(salary);
        starPlayer.setSalary(salary);

        int goal = random.nextInt(100);
        footballPlayer3.setGoal(goal);
        starPlayer.setGoal(goal);

        int assist = random.nextInt(100);
        footballPlayer3.setAssist(assist);
        starPlayer.setAssist(assist);

        int appereances = random.nextInt(100) + 5;
        footballPlayer3.setAppereances(appereances);
        starPlayer.setAppereances(appereances);

        // Meminta input jumlah penghargaan pemain bintang
        System.out.print("Masukkan jumlah penghargaan pemain: ");
        int awards = scanner.nextInt();
        starPlayer.setAwards(awards);

        // Menampilkan biodata pemain, statistik, dan informasi pemain bintang
        System.out.println("\nBiodata pemain:");
        System.out.println("Nama: " + footballPlayer1.getName());
        System.out.println("Umur: " + footballPlayer1.getAge());

        System.out.println();
        footballPlayer2.display();

        System.out.println();
        footballPlayer3.display("Statistik: ");

        System.out.println();
        System.out.println("Informasi Pemain Bintang:");
        starPlayer.display();
        System.out.println();
        starPlayer.display("Statistik: ");
    }
}
