import java.util.ArrayList;
import java.util.Arrays;

public class Array {
	static void catsArray(String... cats) {
		ArrayList<String> catList = new ArrayList<String>(Arrays.asList(cats));
		System.out.println(catList);
	}

	public static void main(String[] args) {
		catsArray("emonk", "elvi", "pipo", "abu", "joko", "ponyo");
	}
}
