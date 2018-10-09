
public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String proba = "Kaixo-Agur"; //here we define an string with a - inside
		String[] parts = proba.split("-"); // we use the method split to separate the string by the -
		
		System.out.println(parts[0]); //as we can see the string has been separated
		System.out.println(parts[1]);
	}

}
