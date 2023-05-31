package demo;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);//using annotation @configuration
        Doctor doctor=context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("mbbs");

        doctor.assist();
    }
}
