import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

//        membuat objek
        FootballPlayer footballPlayer1 = new FootballPlayer();
        FootballPlayer footballPlayer2 = new FootballPlayer();
        FootballPlayer footballPlayer3 = new FootballPlayer();


        System.out.println("Biodata Pemain: ");
        System.out.print("Masukkan Nama Pemain: ");
        String name = scanner.nextLine();
        footballPlayer1.setName(name);

        System.out.print("Masukkan Umur Pemain: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Mengkonsumsi newline
        footballPlayer1.setAge(age);

        System.out.print("Masukkan Klub pemain: ");
        String club = scanner.nextLine();
        footballPlayer1.setClub(club);

        System.out.print("Masukkan posisi pemain: ");
        String position = scanner.nextLine();
        footballPlayer2.setPosition(position);

        int min = 100;
        int max = 300;

//       membuat angka random
        int salary = random.nextInt(max - min + 1) + min;
        footballPlayer2.setSalary(salary);

        int goal = random.nextInt(100);
        footballPlayer3.setGoal(goal);

        int assist = random.nextInt(100);
        footballPlayer3.setAssist(assist);

        int appereances = random.nextInt(100)+5;
        footballPlayer3.setAppereances(appereances);

        System.out.println("Biodata pemain:");
        System.out.println("Nama: " + footballPlayer1.getName());
        System.out.println("Umur: " + footballPlayer1.getAge());

        System.out.println();
        footballPlayer2.display();

        System.out.println();
        footballPlayer3.display("Statistik: ");
    }
}
