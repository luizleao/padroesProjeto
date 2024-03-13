import java.util.ArrayList;
import java.util.ListIterator;
public class ExemploArrayList {
	public static void main(String[] args) {
		ArrayList<Comparable> lista = new ArrayList<Comparable>();
		lista.add("Dinardo");
		lista.add("Rosa");
		lista.add(10);
		lista.add(2465);
		lista.add(3.14159);
		lista.add('A');
		
		ListIterator it = lista.listIterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
}