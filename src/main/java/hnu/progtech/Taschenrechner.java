package hnu.progtech;

/**
 * Hier kommt ein Text zur Erklärung des Zwecks der Klasse
 * @author meyer.lokal
 *
 */

public class Taschenrechner {
	private double result;

	/**
	 * Consructor
	 * @param result kann als Initalwert übergeben werden
	 */
	public Taschenrechner(double result) {
		this.result = result;
	}
	
	/**
	 * Setzt den internen Wert auf 0.0
	 */
	public void clear() {
		result = 0.0;
	}
	
	public double getResult() {
		return result;
	}
	
	public double add(double a) {
		result+=a;
		return result;
	}
	public double minus(double a) {
		result-=a;
		return result;
	}
	
	public double mulitply(double a) {
		result=result*a;
		return result;
	}
	
	public double divide(double a) {
		result=result/a;
		return result;
	}
	
	public boolean istGerade(int zahl) {	
		return true;
	}
	
}
