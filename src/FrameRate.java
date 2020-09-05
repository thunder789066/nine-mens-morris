
public class FrameRate {
	private String frameRate;
	private long lastTime;
	private long delta;
	private int frameCount;
	
	public void initialize() {
		this.lastTime = System.currentTimeMillis();
		this.frameRate = "FPS 0";
	}
	
	public void calculate() {
		long current = System.currentTimeMillis();
		this.delta += current - this.lastTime;
		this.lastTime = current;
		this.frameCount++;
		if( this.delta > 1000 ) {
			this.delta -= 1000;
			this.frameRate = String.format( "FPS %s", this.frameCount );
			this.frameCount = 0;
		}
	}
	
	public String getFrameRate() {
		return this.frameRate;
	}
}
