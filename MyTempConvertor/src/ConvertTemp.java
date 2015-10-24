
public class ConvertTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//converting from degrees to farenheit
		MyTempConvertor tc = new MyTempConvertor(25, 'C');
		System.out.println(tc);
		//converting from farenheit to degrees
		MyTempConvertor tf= new MyTempConvertor(77, 'F');
		
		System.out.println(tf);
		
		tf= new MyTempConvertor(75, 'F');
		
		System.out.println(tf);

	}

}
