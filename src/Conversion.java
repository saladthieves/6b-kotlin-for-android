public class Conversion {
    public static void main(String[] args) {
        // floating-point value conversion issues in Java
        float count = 5 / 2;        // performs auto-conversion after integer division
        System.out.println(count);

        Short width = 5;
        Integer height = 5;
        System.out.println(width.equals(height));  // does not perform auto-conversion
    }
}
