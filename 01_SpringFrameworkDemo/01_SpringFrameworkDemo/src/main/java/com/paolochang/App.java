package com.paolochang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Doctor doctor = context.getBean(Doctor.class);
//        doctor.assist();
//        System.out.println(doctor.getQualification());
//
//        Nurse nurse = (Nurse) context.getBean("nurse");
//        nurse.assist();
//        System.out.println(nurse.getShift());

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Resident residentDoctor = context.getBean(Resident.class);
        residentDoctor.assist();
    }
}
