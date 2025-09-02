package entities;

public class Student {
    private String name;
    private int age;

    public Student(int age) {
        System.out.println("Student has been enrolled.");
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name is" + name);
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age is" + age);
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + this.name + "age=" + this.age + "]";
    }

}
