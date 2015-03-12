package sm.fofx.datacollector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created  on 1/25/2015.
 */
public class Launcher {

    public static void main(String args[]) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Application.xml");

       Object o =  context.getBean("mybean");

    }
}
