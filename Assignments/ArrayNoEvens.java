import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

public class ArrayNoEvens {

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(49);
		numbers.add(13);
		numbers.add(18);
		numbers.add(70);
		numbers.add(25);
		System.out.println("Numbers Array: " + numbers);

		Collections.sort(numbers);
		System.out.println("Numbers Array (ascending): " + numbers);

		ListIterator<Integer> number = numbers.listIterator();

		while (number.hasNext()) {
			if (number.next() % 2 == 0) {
				number.remove();
			}
		}

		System.out.println("Numbers Array (w/o even integers): " + numbers);

	}
}
