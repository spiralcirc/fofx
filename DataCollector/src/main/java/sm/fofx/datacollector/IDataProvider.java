package sm.fofx.datacollector;

import sm.fofx.Index;

/**
 * Created on 3/17/2015.
 */
public interface IDataProvider {
    /**
     * Downloads the EOD data for the given index and loads to the DB
     * @param index
     */
    void getEODData(Index index);
}
