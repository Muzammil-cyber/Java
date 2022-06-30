public class MethodOverloading {

    public int multiply(int x, int y){
        return x*y;
    }

    public int multiply(int x, int y,int z){
        return x*y*z;
    }
    public double multiply(double x, double y){
        return x*y;
    }

    public static void main(String[] args) {

        MethodOverloading demo = new MethodOverloading();

        System.out.println("Answer: " + demo.multiply(1,2));
        System.out.println("Answer: " + demo.multiply(5,2,6));
        System.out.println("Answer: " + demo.multiply(2.5,45.2));
    }
}
