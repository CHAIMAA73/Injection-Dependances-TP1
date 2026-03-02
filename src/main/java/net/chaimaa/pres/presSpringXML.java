package net.chaimaa.pres;

import net.chaimaa.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    public static void main(String[] args) {
        ApplicationContext springcontext =
                new ClassPathXmlApplicationContext("config.xml");
        IMetier metier =  springcontext.getBean(IMetier.class);
        System.out.println("RES="+metier.calcul());
    }
}
