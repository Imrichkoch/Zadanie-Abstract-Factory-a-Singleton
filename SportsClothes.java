

//materska trieda pre vsetky 3 druhy oblecenia

public abstract class SportsClothes {
	int size;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	String color;
	
	SportsClothes(int size, String color){
		this.size=size;
		this.color = color;
	}
}
