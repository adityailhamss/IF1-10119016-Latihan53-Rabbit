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
public class Rabbit extends Animal {
   private final String color;
    private final String name;
    
    public Rabbit(String name, boolean veg, String food, int legs, String color){
        super(veg, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getName(){
        return name;
    }
}