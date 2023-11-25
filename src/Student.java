public class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public static void main(String[] args) {
            // Create an array of Student objects
            Student[] students = new Student[3];

            // Populate the array with Student objects
            students[0] = new Student("Ali", 20);
            students[1] = new Student("Basma", 21);
            students[2] = new Student("kareem", 19);

            // Access and manipulate array elements
            System.out.println("Student names:");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

