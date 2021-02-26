
public class Crosshair {
	
	private int x, y;
	
	public Crosshair() {
		
	}
	public Crosshair(int x, int y) {
		setCrossX(x);
		setCrossY(y);
	}
	
	//Getter/Setter
	public void setCrossX(int x) {
		this.x = x;
	}
	public void setCrossY(int y) {
		this.y = y;
	}
	public int getCrossX() {
		return x;
	}
	public int getCrossY() {
		return y;
	}
	
}
