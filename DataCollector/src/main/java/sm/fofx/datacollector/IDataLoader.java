package sm.fofx.datacollector;

import sm.fofx.datacollector.model.Quote;

import java.util.Date;
import java.util.Map;

/**
 * Interface for loading data to DB
 * Created on 3/17/2015.
 */
public interface IDataLoader {
    void loadData(Map<Date, Quote> quoteMap);
}
