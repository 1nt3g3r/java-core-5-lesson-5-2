package exception;

public class EqualsHashcodeTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 4); //area 24
        Rectangle r2 = new Rectangle(12, 2); //area 24
        Rectangle r3 = new Rectangle(5, 5); //area 25

        System.out.println("r1.equals(r2) = " + r1.equals(r2));
        System.out.println("r2.equals(r3) = " + r2.equals(r3));

        System.out.println("r1.hashCode() = " + r1.hashCode());
        System.out.println("r2.hashCode() = " + r2.hashCode());
        System.out.println("r3.hashCode() = " + r3.hashCode());


    }
}
