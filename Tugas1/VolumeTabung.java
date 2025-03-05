public class VolumeTabung {
    public static void main(String[] args) {
        double diameter = 5;
        double tinggi = 10;
        double radius = diameter / 2;
        double volume = Math.PI * Math.pow(radius, 2) * tinggi;
        System.out.println("Volume tabung: " + volume);
    }
}
