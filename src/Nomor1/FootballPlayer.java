package Nomor1;

public class FootballPlayer {
    private String name, club, position;
    private int age, salary, goal, assist, appereances;

    // Constructor yang membuat nilai atribut menjadi nilai default
    public FootballPlayer() {
        name = "";
        age = 0;
        club = "";
        position = "";
        salary = 0;
        goal = 0;
        assist = 0;
        appereances = 0;
    }

    // Method overloading untuk menampilkan informasi detail pemain
    public void display() {
        System.out.println("Informasi detail:");
        System.out.println("Klub       : " + club);
        System.out.println("Posisi     : " + position);
        System.out.println("Gaji pemain: $" + salary + "Million");
    }

    // Method overloading untuk menampilkan statistik pertandingan pemain
    public void display(String statistik) {
        System.out.println(statistik);
        System.out.println("Jumlah Pertandingan: " + appereances);
        System.out.println("Jumlah Gol   : " + goal);
        System.out.println("Jumlah Assist: " + assist);
    }

    // Method setter dan getter untuk semua atribut pemain
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public void setAssist(int assist) {
        this.assist = assist;
    }

    public void setAppereances(int appereances) {
        this.appereances = appereances;
    }
}
