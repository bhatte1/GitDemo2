import java.lang.reflect.Array;

public class basics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	String[] array1 = {"a", "b", "c", "x"};
	String[] array2 = {"z", "y", "x"};
	String[] array3 = {"z", "y", "x"};
	
	findNemo(array1, array2);
		
	}
	
	public static void findNemo(String[] array1, String[] array2) {
		for(int i =0; i<Array.getLength(array1); i++) {
			for(int j=0; j<Array.getLength(array2); j++) {
				if (array1[i] == array2[j]) {
					System.out.println("True");	
					break;
			}
			
			}
		}
	}
}