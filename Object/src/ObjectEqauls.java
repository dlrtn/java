public class ObjectEqauls {

    public static void main(String[] args) {
        String first = new String("Quora");
        String second = new String("Facebook");
        String third= new String("Quora");
        String fourth = second;

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        System.out.println("===== Referential Equality =====");
        // Referential Equality
        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == fourth);

        System.out.println("===== Logical Equality =====");
        // logical equality
        System.out.println(first .equals(second));
        System.out.println(first.equals(third));
        System.out.println(second.equals(fourth));

    }
}
