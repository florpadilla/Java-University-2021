package boxExercise;

public class Box {
	private int width;
	private int deep;
	private int height;
	
	//Empty constructor
	public Box() {}
	
	//Constructor...
	public Box(int width, int deep, int height) {
		this.width = width;
		this.deep = deep;
		this.height =height;
	}
	//metodo para calcular el volumen. Como estoy en la misma clase no hace falta usar getters y setters
	public int getVolume() {
		return this.width*this.deep*this.height;
		
	}
}
