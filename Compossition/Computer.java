package Compossition;

public class Computer {

	private String merkKom;
	private Mouse mouse;
	private Keyboard keyboard;
		  private CPU cpu;
		  
		  public Computer(String merkKom,CPU cpu, Mouse mouse, Keyboard keyboard) {
		    this.merkKom = merkKom;
		    this.mouse = mouse;
		    this.keyboard = keyboard;
		    this.cpu = cpu;
		  }
		  public String toString() {
			  return String.format(" Komputer : %s \n Dengan Komponen \n CPU : %s \n Mouse : %s \n Keyboard : %s \n", merkKom, cpu, mouse, keyboard);
		  }
}
		  