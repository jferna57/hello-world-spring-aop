package net.jferna57.samples.spring.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

        public static void main(String[] args) throws Exception {

            ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

            System.out.println("-------- Aspect @Before");
            CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
            customer.addCustomer();

            System.out.println("-------- Aspect @AfterReturning");
            System.out.println("Value returned --> " + customer.addCustomerReturnValue());

            System.out.println("-------- Aspect @AfterThrowing");
            customer.addCustomerThrowException();

        }
}
