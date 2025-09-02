package springtest;

import entities.Student;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testing {
    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");
        Student selectedStudent = (Student) context.getBean("student1");
        System.out.println(selectedStudent);
        context.close();

    }
}