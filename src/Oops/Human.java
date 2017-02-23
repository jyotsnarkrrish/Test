package Oops;

class Human {

	public void eat() {
		System.out.println("Human is eating");
	}

	public static void main(String args[]) {
		Boy b = new Boy();
		Human h = new Human();
		Human bh = new Boy();
		Boy bb = (Boy) new Human();
		b.eat();
		h.eat();
		bh.eat();
		bb.eat();
	}

}

class Boy extends Human {
	public void eat() {
		System.out.println("Boy is eating");
	}

}
