package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();

//        ATM atm = context.getBean(ATM.class);
//
//        String name = atm.validateCustomer(4,2542);
//        System.out.println(name + " has " + atm.getBalance());
//        atm.withdraw(100);
//        System.out.println(name + " has " + atm.getBalance());
    }
}
