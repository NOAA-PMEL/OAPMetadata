package test;

public class TestNewLineSplit {

	public static void main(String[] args) {
		String line = "my neat reasearch project\nanother project\none more time";
		String[] lines = line.split("[\\n\\r]");
		System.out.println(lines);

	}

}
