package clientwsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="NewDataSet")
public class NewDataSet1 {
    
    @Element(name="Table")
    private PeriodicTableElement Table;

    public PeriodicTableElement getTable() {
        return Table;
    }

    public void setTable(PeriodicTableElement Table) {
        this.Table = Table;
    }
    
}