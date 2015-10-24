public class MyTempConvertor implements Temperature {
	private double celsius; // stores the temperature as a Celsius value
	private double farenHeit; // stores the temperature as a Celsius value
	private char c;

	public MyTempConvertor(double value, char scale) {
		this.c = scale;
		
		setCelcius(value);
		setFarenheit(value);

	}

	public double getCelsius() {
		// TODO Auto-generated method stub
		return celsius;
	}

	public double getFarenheit() {
		// TODO Auto-generated method stub
		return farenHeit;
	}

	public void setCelcius(double celsius) {
		// TODO Auto-generated method stub
		if (c == 'C')
			this.celsius = celsius;
		else
			this.celsius = (celsius  - 32.0) * (5.0 / 9.0);
	}

	public void setFarenheit(double celsius) {
		// TODO Auto-generated method stub
		if (c == 'C')
			this.farenHeit = (9.0 / 5.0) * celsius + 32.0;
		else
			this.farenHeit = celsius;
	}

	public String toString() {
		if(c=='C')
			return (round(getCelsius()) + " Degree Celsius is "
				+ round(getFarenheit()) + " in Farenheit");
		else
			return (round(getFarenheit()) + " Farenheit is "
					+ round(getCelsius()) + " in Degree Celsius");
	}

	private double round(double t) {
		// TODO Auto-generated method stub
		return Math.round(10 * t) / 10.0;
	}

}
