public class Person {
    
    public static void main(String[] args) {

        // create default Student
        Student s1 = new Student();
        System.out.println(s1.getName());
        s1.setName("Roland Deschain");
        System.out.println(s1.getName());
        
        // create Student with parameters
        Student s2 = new Student("Susan Delgado", 16);
        System.out.println(s2.getName() + " " + s2.getAge());

        s1.saySomething("Hi there");
        s2.saySomething("Oh hello, my name is " + s2.getName());
    }
}

class Student {

    private String name;
    private int age;
    
    // default constructor
    public Student() {
    }

    // parameterised constructor
    public Student(String name, int age) {
        // name = name does not work
        this.name = name;
        this.setAge(age); // alternatively
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // setters
    public void setName(String aName) {
        this.name = aName;
    }

    public void setAge(int anAge) {
        this.age = anAge;
    }

    public void saySomething(String something) {
        System.out.println(this.name + " says: " + something);
    }
}
