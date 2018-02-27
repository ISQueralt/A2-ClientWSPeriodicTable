package clientwsperiodictable;
import java.util.ArrayList;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class A2ClientWSPeriodicTable {
    public static void main(String[] args) {
        
        try {
            System.out.print("Enter an element of the periodic table: ");
            String element =  new Scanner(System.in).nextLine();
            String source = getAtomicNumber(element);
            Serializer serializer = new Persister();
            NewDataSet1 NewDataSet = new NewDataSet1();
            serializer.read(NewDataSet, source);
            
           
            
            System.out.print("\n1 - Get Atomic Number\n\n"
                    + "2 - Get Atomic Weight\n\n3 - Get Element Symbol"
                    + "\n\n4 - Get Atoms\n\nEnter a number: ");
            
            switch (new Scanner(System.in).nextInt()) {
                case 1: 
                    System.out.println("Information of " + element);
                    System.out.println("Atomic Number = " + NewDataSet.getTable().getAtomicNumber());
                    System.out.println("Element name = " + NewDataSet.getTable().getElementName());
                    System.out.println("Symbol = " + NewDataSet.getTable().getSymbol());
                    System.out.println("Atomic weight = " + NewDataSet.getTable().getAtomicWeight());
                    System.out.println("Boiling point = " + NewDataSet.getTable().getBoilingPoint());
                    System.out.println("Ionisation potencial = " + NewDataSet.getTable().getIonisationPotential());
                    System.out.println("Electronegativity = " + NewDataSet.getTable().getEletroNegativity());
                    System.out.println("Atomic radius = "+ NewDataSet.getTable().getAtomicRadius());
                    System.out.println("Melting point = " + NewDataSet.getTable().getMeltingPoint());
                    System.out.println("Density = " + NewDataSet.getTable().getDensity());
                    break;
                    
                case 2:
                    System.out.println("The atomic weight of " + element + " is "
                            + NewDataSet.getTable().getAtomicWeight());
                    break;

                case 3: 
                     System.out.println("Symbol = " + NewDataSet.getTable().getSymbol());
                    break;
                    
                case 4: 
                    Serializer serializer2 = new Persister();
                    serializer2.read(NewDataSet, source);
                    System.out.println("All atoms: \n" + getAllAtoms(serializer2));
                    break; 

                default:
                     System.out.println("Error number is not between 1 and 4.");
            }
            
        } catch (Exception e) {
            System.out.print("Sorry, but what you entered is not an "
                    + "element of the periodic table.");
        }
    }
    
    
    public static ArrayList<String> getAllAtoms(Serializer s){
        NewDataSet2 NewDataSet2 = new NewDataSet2();
        
        try {
            s.read(NewDataSet2, getAtoms());
        } catch (Exception e) {
        }
        
        ArrayList<PeriodicTableElement> listTables = NewDataSet2.getTable();
        ArrayList<String> elementsList = new ArrayList<>();
        
        listTables.forEach((table) -> {
            elementsList.add(table.getElementName());
        });
        return elementsList;
    }
        
    private static String getAtomicNumber(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicNumber(elementName);
    }

    private static String getAtomicWeight(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtomicWeight(elementName);
    }

    private static String getAtoms() {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getAtoms();
    }

    private static String getElementSymbol(java.lang.String elementName) {
        net.webservicex.Periodictable service = new net.webservicex.Periodictable();
        net.webservicex.PeriodictableSoap port = service.getPeriodictableSoap();
        return port.getElementSymbol(elementName);
    }
}