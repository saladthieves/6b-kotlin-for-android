public class PropertyTest {
    public static void main(String[] args) {

        // Creating an instance of the Student class, defined in Kotlin
        Student student = new Student("Kebedech", 28);
        student.setAge(30);                     // sees the property setter method
        System.out.println(student.getAge());   // sees the property getter method

        student.setName("Samuel");
    }
}
