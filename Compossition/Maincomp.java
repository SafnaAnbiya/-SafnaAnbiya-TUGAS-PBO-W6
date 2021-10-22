package Compossition;

public class Maincomp {

	public static void main(String[] args) {
		    CPU obj1 = new CPU ("intel i5");
		    Mouse obj2 = new Mouse ("Logitech");
		    Keyboard obj3 = new Keyboard ("Logitec");
		    Computer obj4 = new Computer ("Toshiba", obj1, obj2, obj3);
		    System.out.println(obj4);
		    
	}
}