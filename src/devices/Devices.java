package devices;

public abstract class Devices {

public String SerialNumber;

public Devices(String serialNumber) {
	super();
	SerialNumber = serialNumber;
}

public String getSerialNumber() {
	return SerialNumber;
}

public void setSerialNumber(String serialNumber) {
	SerialNumber = serialNumber;
}
 
public abstract void processDoc(String doc);



	
	}
