import java.util.ArrayList;
import java.util.List;


public class Classes {

    public static void main(String[] args) {


        // Classes & Method
        Lens len1 = new Lens("sony", "40px");
        Lens mobcam1 = new MobileCam("sony", "25-70px", false);
        Lens len3 = new Lens("cannon", "25px");

        len1.brand = "samsung";

        System.out.println(len1.brand);

        ArrayList<Integer> intArray = new ArrayList<>(5);
        intArray.add(10);
        intArray.add(20);
        intArray.add(30);
        intArray.add(40);
        intArray.add(50);

        List<Integer> squareArray = intArray.stream().map(x -> x * x).toList();
        System.out.println("Set of Square: " + squareArray);

        int total = intArray.stream().reduce(0,(ans,x)->ans+x);
        System.out.println("total = " + total);

        List<String> strList = new ArrayList<>();
        strList.add("java");
        strList.add("python");
        strList.add("c# \"C sharp\"");
        //System.out.println("Original List: "+ strList);
        strList.stream().forEach(z-> System.out.println("Original item: "+ z));

        List<String> filtered = strList.stream().filter(a -> a.startsWith("j")).toList();
        System.out.println("Filtered List: "+filtered);

        List<String> sorted = strList.stream().sorted().toList();
        System.out.println("Sorted List: "+sorted);

    }

}
class Lens{
    protected String brand;
    protected String focalLength;
    public Lens(String brand, String focalLength){
        this.brand = brand;
        this.focalLength = focalLength;
    }
}
class MobileCam extends Lens{

    private boolean frontcam;

    public MobileCam(String brand, String focalLength, boolean frontCamera) {
        super(brand, focalLength);
        frontcam = frontCamera;
    }

    public boolean isFrontcam() {
        return frontcam;
    }

    public void setFrontcam(boolean frontcam) {
        this.frontcam = frontcam;
    }
}
