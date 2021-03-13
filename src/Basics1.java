import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList<String> names = new ArrayList<String>();  
	names.add("Andrew");
	names.add("Vinayak");
	names.add("Ajmal");
	names.add("Crater");
	names.add("Shaw");
	int count =0;
	
	for(int i = 0; i < names.size(); i++) {
		String Actual = names.get(i);
		if(Actual.startsWith("A")) {
			count++;
		}
		
			
	}
	System.out.println     (count);
	
	//names.stream().filter(s->s.startsWith("A")).count();
	//names.stream().filter(s->s.length()>4).forEach(s->System.out.print(s));
	
	List<String>names1 = Arrays.asList("Andrew","Vinayak","Ajmal");
	names.stream().sorted().forEach(s->System.out.println(s));
}
}
  