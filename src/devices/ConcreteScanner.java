package devices;

public class ConcreteScanner extends Devices  {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
		
	}
	
	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		
	}

    public String scan() {
    	return "Scanned content";
    }
	





}




