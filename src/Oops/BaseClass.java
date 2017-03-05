package Oops;

//Child class has the same method as of base class. In such cases child class overrides the parent class method 
//without even touching the source code of the base class. This feature is known as method overriding.
//Abstract methods must be overridden
//Static and final methods cannot be overridden
//Constructors cannot be overridden
//It is also known as Runtime polymorphism.
class BaseClass {

	public void methodToOverride() {
		System.out.println("Base Class");
	}
}

class DerivedClass  extends BaseClass {
	public void methodToOverride() {
		System.out.println("Derived class");
	}
	public static void main(String args[]) {
		DerivedClass d = new DerivedClass();
		BaseClass b = new BaseClass();
		BaseClass bh = new DerivedClass();
		//DerivedClass bb =  new BaseClass();
		d.methodToOverride();
		b.methodToOverride();
		bh.methodToOverride();
		//bb.methodToOverride();
	}
}
