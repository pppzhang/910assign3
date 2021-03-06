
package cse360assign3;

/**
 * The class Calculator is designed to do basic arithmetic operations including add, subtract, multiply and divide.
 * @author Peng Zhang (PIN 910)
 *
 */
public class Calculator {

	private int total;
	private String str; //for history string output
	
	/**
	 * The default constructor does not take input. 
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		str = "0";
	}
	
	/**
	 * This method returns the result.
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * This method adds input value to the result. 
	 */
	public void add (int value) {
		total = total + value;
		str = str + " + " + value;
	}
	/**
	 * This method subtracts input value from the result.
	 */
	public void subtract (int value) {
		total = total - value;
		str = str + " - " + value;
	}
	/**
	 * This method multiplies the result by the input value.
	 */
	public void multiply (int value) {
		total = total * value;
		str = str + " x " + value;
	}
	/**
	 * This method divide the result by the input value.
	 */
	public void divide (int value) {
		if (value == 0) total = 0;  // if divider is zero, set the result as zero instead of error message
		else total = total / value;
		str = str +" / " + value;
	}
	/**
	 * This method returns the operation histories.
	 */
	public String getHistory () {
		return str;
	}
}
