package sm.fofx.datacollector;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created  on 1/25/2015.
 */
public class Launcher {

    public static void main(String args[]){
        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            // and start it off
            scheduler.start();

            scheduler.shutdown();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
}
