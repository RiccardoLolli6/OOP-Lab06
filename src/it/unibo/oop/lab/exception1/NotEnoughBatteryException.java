package it.unibo.oop.lab.exception1;

public class NotEnoughBatteryException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -288979685441144222L;
	
	public String toString() {
        return "Can not use more energy, battery depleted";
    }
	
	public String getMessage() {
        return this.toString();
    }
}
