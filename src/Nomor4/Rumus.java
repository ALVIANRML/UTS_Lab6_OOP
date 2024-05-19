package Nomor4;

public class Rumus {

    private double distance;  // Jarak dalam meter
    private double speed;     // Kecepatan dalam meter per detik
    private double time;      // Waktu dalam detik

    // Constructor untuk menghitung jarak berdasarkan kecepatan dan waktu
    public Rumus(double speed, double time) {
        this.speed = speed;
        this.time = time;
        this.distance = calculateDistance();
    }

    // Constructor untuk menghitung kecepatan berdasarkan jarak dan waktu
    public Rumus(double distance, double time, boolean isSpeed) {
        this.distance = distance;
        this.time = time;
        if (isSpeed) {
            this.speed = calculateSpeed();
        }
    }

    // Constructor untuk menghitung waktu berdasarkan jarak dan kecepatan
    public Rumus(double distance, double speed, boolean isTime, boolean dummy) {
        this.distance = distance;
        this.speed = speed;
        if (isTime) {
            this.time = calculateTime();
        }
    }

    // Method untuk menghitung jarak: distance = speed * time
    private double calculateDistance() {
        return this.speed * this.time;
    }

    // Method untuk menghitung kecepatan: speed = distance / time
    private double calculateSpeed() {
        return this.distance / this.time;
    }

    // Method untuk menghitung waktu: time = distance / speed
    private double calculateTime() {
        return this.distance / this.speed;
    }

    // Getter untuk jarak
    public double getDistance() {
        return distance;
    }

    // Getter untuk kecepatan
    public double getSpeed() {
        return speed;
    }

    // Getter untuk waktu
    public double getTime() {
        return time;
    }
}
