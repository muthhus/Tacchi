package tacchi.particlegame;

public class Color {
	public float r;
	public float g;
	public float b;
	public float a;
	
	public Color(float r, float g, float b, float a) {
		this.r = r;
		this.g = g;
		this.b = b;
		this.a = a;
	}
	
	public Color(float r, float g, float b) {
		this(r, g, b, 1);
	}
	
	public Color() {
		this(0, 0, 0, 0);
	}
}
