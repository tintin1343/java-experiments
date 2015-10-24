/**
 * This is an interface representing temperatures, with functionality
 * for converting their values degree Celsius and Farenheit.
 * @author Nitin Shetty
 * @see MyTempConvertor
 */
public interface Temperature {
	/** @return the degree Celsius value for this temperature */
	public double getCelsius();
	
	/** @return the  Farenheit value for this temperature */
	public double getFarenheit();
	
	/** @param celsuis the degree Celsius value for this temperature */
	public void setCelcius(double celsius);
	
	/** @param farenheit the degree Celsius value for this temperature */
	public void setFarenheit(double celsius);

}
