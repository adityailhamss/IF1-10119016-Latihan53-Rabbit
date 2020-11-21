package if1.pkg10119016.latihan53.rabbit;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * menampilkan identitas seekor kelinci
 */
public class Program {

    public static void main(String[] args) {
        Rabbit oo1 = new Rabbit("Peter",true,"Grass",4,"Grey");
        System.out.println("Hello, his name is " + oo1.getName());
        System.out.println(oo1.getName() + " is Vegetarian? " + oo1.isVegetarian());
        System.out.println(oo1.getName() + " eat " + oo1.getEats());
        System.out.println(oo1.getName() + " has " + oo1.getNoOfLegs() + " legs");
        System.out.println(oo1.getName() + " color is " + oo1.getColor());
    }
}
