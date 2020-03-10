fun main() {
    // using the Student and Course classes
    val student = Student("Abebe", 28)
    val course = Course("English", student)

    println("Student name: ${student.name}")
    println("Student age: ${student.age}")

    // Creating an instance of the Teacher class, defined in Java
    val teacher = Teacher()
    teacher.name = "Yonas"      // automatically invokes the setter method
    println(teacher.name)       // automatically invokes the getter method

    teacher.isActive = true     // invokes the setter, using 'isActive' name instead of 'active'
}

// Student class with two properties - name: String and age: Int
class Student(var name: String, var age: Int)

// Course class with two properties - name: String and student: Student
class Course(var name: String, val student: Student)