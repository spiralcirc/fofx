package sm.fofx.datacollector;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.QuandlSession;
import com.jimmoores.quandl.TabularResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created  on 1/25/2015.
 */
public class Launcher {

    public static void main(String args[]) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Application.xml");

        QuandlSession session = QuandlSession.create();
        TabularResult tabularResult = session.getDataSet(
                DataSetRequest.Builder.of("WIKI/AAPL").build());
        System.out.println(tabularResult.toPrettyPrintedString());

    }
}
