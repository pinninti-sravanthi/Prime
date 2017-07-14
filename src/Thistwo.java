
public class Thistwo {
	Thistwo get() {
		return this;// this is returning a statement

	}

	void getmsg() {
		System.out.println("this is a statement");
	}

	public static void main(String[] args) {
		new Thistwo().get().getmsg();

	}
}
