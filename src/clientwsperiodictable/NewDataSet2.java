package clientwsperiodictable;
import java.util.ArrayList;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSet2 {
    
     @ElementList(inline=true)
    private ArrayList<PeriodicTableElement> Tables = new ArrayList<>();

    public ArrayList<PeriodicTableElement> getTable() {
        return Tables;
    }

    public void setTable(ArrayList<PeriodicTableElement> Tables) {
        this.Tables = Tables;
    }
}