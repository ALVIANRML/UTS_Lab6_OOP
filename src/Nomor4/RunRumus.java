package Nomor4;

public class RunRumus {
        public static void main(String[] args) {
            // Menghitung jarak dengan kecepatan 10 m/s dan waktu 5 detik
            Rumus calcDistance = new Rumus(10, 5);
            System.out.println("Jarak: " + calcDistance.getDistance() + " meter");

            // Menghitung kecepatan dengan jarak 100 meter dan waktu 10 detik
            Rumus calcSpeed = new Rumus(100, 10, true);
            System.out.println("Kecepatan: " + calcSpeed.getSpeed() + " meter per detik");

            // Menghitung waktu dengan jarak 50 meter dan kecepatan 5 m/s
            Rumus calcTime = new Rumus(50, 5, true, true);
            System.out.println("Waktu: " + calcTime.getTime() + " detik");
        }
    }

