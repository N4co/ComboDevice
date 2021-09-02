package devices;

public class ConcretePrinter extends Devices {

	public ConcretePrinter(String serialNumber) {
		super(serialNumber);
		
}

	@Override
	public void processDoc(String doc) {
	System.out.println("Printer Pocessing : " + doc);
	}

    public void print(String doc) {
    	System.out.print("Printing : " + doc);
    }




}



