package sm.fofx.datacollector;

import com.jimmoores.quandl.DataSetRequest;
import com.jimmoores.quandl.QuandlSession;
import com.jimmoores.quandl.TabularResult;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.threeten.bp.LocalDate;

import java.util.Date;

/**
 * Created  on 1/25/2015.
 */
public class Launcher {

    public static void main(String args[]) {
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("Application.xml");

        QuandlSession session = QuandlSession.create();
        TabularResult result = session.getDataSet(DataSetRequest.Builder.of("WIKI/APPL").withStartDate(LocalDate.of(2015, 03, 17)).withEndDate(LocalDate.of(2015, 03, 18)).build());
//        TabularResult tabularResult = session.getDataSet(
//                DataSetRequest.Builder.of("WIKI/AAPL").build());
        System.out.println(result.toPrettyPrintedString());

    }
}
