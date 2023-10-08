package org.yedhu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Doctor doctor = new Doctor();   //Tightly coupled...................... 1
//        doctor.assist();


        //Application context is used to get beans from container............... 2
        //Dependency injection is possible because of application context.......

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//
//        Nurse nurse = (Nurse)context.getBean("nurse");
//        nurse.assist();

        //we are tying to do it with an interface so that we can hide more things....

//        Staff staff1 = (Doctor)context.getBean("doctor");
//        staff1.assist();
//
//        Staff staff2 = (Nurse)context.getBean("nurse");
//        staff2.assist();


        //now when we have parameter................................................

//        Doctor doctor = (Doctor) context.getBean("doctor");
//
//        System.out.println(doctor.getQualification());

        //for annotation based configuration..................................


//        Staff staff = context.getBean(Doctor.class);
//        staff.assist();
//
//        Staff staff1 = context.getBean(Nurse.class);
//        staff1.assist();  //---- this will throw error because Nurse is not marked as component

        //java based configuaration .................................................
        //also change the context for annotation based config.........................

        ApplicationContext context1 = new AnnotationConfigApplicationContext(BeanConfig.class);

//        Doctor doctor = context1.getBean(Doctor.class);
//        doctor.assist();

        //for prototype scope............................................................
        Doctor doc1 = context1.getBean(Doctor.class);
        doc1.setQualification("MBBS");
        System.out.println(doc1);

        Doctor doc2 = context1.getBean(Doctor.class);
        //doc1.setQualification("MBBS");
        System.out.println(doc2);


        //
    }
}
