public class Hello {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Hello hello = new Hello();
		System.out.println("Hello World!");
		String s1 = "abc";
		String s2 = "def";
		String s3 = "def";
		System.out.println(s2 == s3); // true
		System.out.println(s2.equals(s3)); // true
		String s4 = new String("def");
		String s5 = new String("def");
		System.out.println(s3 == s4); // false
		System.out.println(s3.equals(s4)); // true
		System.out.println("s4 == s5 = " + (s4 == s5));
		System.out.println("s4.equals(s5) = " + s4.equals(s5));
	}
}
