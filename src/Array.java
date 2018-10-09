
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array ={ //this is a way to define an array
			1,5,3
		};
		
		System.out.println(array[1]); //here we can see that the different integers have been saved in the array
		System.out.println(array[0]);
		System.out.println(array[2]);
		System.out.println();
		
		
		int[] proba; //this is another way to define an array
		proba= new int[4];
		proba[0]=4;
		proba[1]=31;
		proba[2]=2;
		proba[3]=65;
	
		System.out.println(proba[0]); //here we can see that the different integers have been saved in the array
		System.out.println(proba[1]);
		System.out.println(proba[2]);
		System.out.println(proba[3]);
	}

}
