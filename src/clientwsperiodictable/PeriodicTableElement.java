package clientwsperiodictable;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="Table")
public class PeriodicTableElement {
  @Element(required=false)
    private String AtomicNumber;
  @Element(required=false)
    private String Symbol;
   @Element(required=false)
    private String ElementName;
    @Element(required=false)
    private String AtomicWeight;
    @Element(required=false)
    private String BoilingPoint;
    @Element(required=false)
    private String IonisationPotential;
    @Element(required=false)
    private String EletroNegativity;
    @Element(required=false)
    private String AtomicRadius;
    @Element(required=false)
    private String MeltingPoint;
    @Element(required=false)
    private String Density;

    public String getAtomicNumber() {
        return AtomicNumber;
    }

    public void setAtomicNumber(String AtomicNumber) {
        this.AtomicNumber = AtomicNumber;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    public String getElementName() {
        return ElementName;
    }

    public void setElementName(String ElementName) {
        this.ElementName = ElementName;
    }

    public String getAtomicWeight() {
        return AtomicWeight;
    }

    public void setAtomicWeight(String AtomicWeight) {
        this.AtomicWeight = AtomicWeight;
    }

    public String getBoilingPoint() {
        return BoilingPoint;
    }

    public void setBoilingPoint(String BoilingPoint) {
        this.BoilingPoint = BoilingPoint;
    }

    public String getIonisationPotential() {
        return IonisationPotential;
    }

    public void setIonisationPotential(String IonisationPotential) {
        this.IonisationPotential = IonisationPotential;
    }

    public String getEletroNegativity() {
        return EletroNegativity;
    }

    public void setEletroNegativity(String EletroNegativity) {
        this.EletroNegativity = EletroNegativity;
    }

    public String getAtomicRadius() {
        return AtomicRadius;
    }

    public void setAtomicRadius(String AtomicRadius) {
        this.AtomicRadius = AtomicRadius;
    }

    public String getMeltingPoint() {
        return MeltingPoint;
    }

    public void setMeltingPoint(String MeltingPoint) {
        this.MeltingPoint = MeltingPoint;
    }

    public String getDensity() {
        return Density;
    }

    public void setDensity(String Density) {
        this.Density = Density;
    }
    
    public String toString(){
        return this.ElementName;
    }
}