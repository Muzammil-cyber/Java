public class GreaterLessThan {
	public static void main(String[] args) {   
		double creditsEarned = 176.5;
    double creditsOfSeminar = 8;
    double creditsToGraduate = 180;
    boolean graduated = creditsEarned > creditsToGraduate;
    System.out.println(graduated);
    double creditsAfterSeminar = creditsEarned + creditsOfSeminar;
    System.out.println(creditsToGraduate < creditsAfterSeminar);
