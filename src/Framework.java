import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Framework extends JFrame implements Runnable {
	
	/* Game Thread */
	private Thread gameThread;
	
	/* Buffering Strategy for Graphics Object */
	private BufferStrategy bs;
	
	/* true if game is still active */
	private volatile boolean running;
	
	/* frame rate for GUI */
	protected FrameRate frameRate;
	
	/* Canvas to draw animation/game on */
	protected Canvas canvas;
	
	/* GUI details - accessible in child classes (protected) */
	protected Color appBackground = Color.LIGHT_GRAY;
	protected Color appBorder = Color.DARK_GRAY;
	protected float appBorderScale = 0.8f;
	protected Color appFPSColor = Color.BLACK;
	protected Font appFont = new Font("Courier New", Font.PLAIN, 14);
	protected Color appFontColor = Color.BLACK;
	protected int appSleep = 10;
	protected String appTitle = "TBD-Title";
	protected int appWidth = 640;
	protected int appHeight = 480;
	
	public Framework() {
		// ???????????
	}
	
	private void createAndShowGUI() {
		this.setTitle(this.appTitle);
		
		/* draw canvas */
		this.canvas = new Canvas();
		this.canvas.setBackground(this.appBackground);
		
		this.canvas.setIgnoreRepaint(true);
		
		/* Add canvas to container of JFrame */
		this.getContentPane().add(this.canvas);
		
		/* Set sizes */
		this.canvas.setSize(this.appWidth, this.appHeight);
		
		/* Figures out sizes of all components, resizes window */
		this.pack();
		
		/* Start window */
		this.setVisible(true);
		
		/* buffer is doubled */
		this.canvas.createBufferStrategy(2); //2 Argument indicates # of buffers
		this.bs = this.canvas.getBufferStrategy(); //Retrieve strategy created for use
		
		/* Buttons immediately work, don't have to click into window */
		this.canvas.requestFocus();
		
		/* runnable obj invoked when thread is started */
		this.gameThread = new Thread(this);  //Pass 'this' runnable object
		
		/* we passed this class as the Runnable reference */
			this.gameThread.start(); //invokes run()
	}
	
	@Override public void run() {
		this.running = true; //Set running
		
		/* Responsible for setting up your objects in game */
		this.initialize();
		
		/* Time calculations */
		long curTime = System.nanoTime();
		long lastTime = curTime;
		double nsPerFrame;
		
		while (this.running) {
			curTime = System.nanoTime();
			nsPerFrame = curTime - lastTime;  //Time passed since last interaction
			
			/* Invoke game loop with current speed of your computer */
			this.gameLoop( (float) (nsPerFrame / 1.0E9) );
			
			lastTime = curTime;
		}
		
		/* Once loops ends, program is done */
		this.terminate();
	}
	
	protected void initialize() {
		this.frameRate = new FrameRate();
		this.frameRate.initialize();
	}
	
	protected void terminate() {
		// ??????????
	}
	
	private void gameLoop(float delta) {
		// process inputs
		this.processInput(delta);
		
		// update obj's
		this.updateObjects(delta);
		
		// draw next frame
		this.renderFrame();
		
		// pauses game thread
		this.sleep(this.appSleep);
	}
	
	protected void processInput(float delta) {
		// ???????
	}
	
	protected void updateObjects(float delta) {
		// ??????????
	}
	
	protected void renderFrame() {
		do {
			do {
				Graphics g = null;
				try {
					//Retrieve graphics from Canvas's buffer strategy
					g = this.bs.getDrawGraphics();
					
					//Clear Graphics for next frame
					g.clearRect(0, 0, this.getWidth(), this.getHeight());
					
					//Render frame
					this.render(g);
				} finally {
					//Dispose of Graphics object, memory efficiency
					if (g != null)
						g.dispose();
				}
			//Stops when Window Manager has destroyed Graphics
			} while (bs.contentsRestored());
			
			/* show() swaps current graphics with one just drew on */
			this.bs.show();
			
		//Window manager done
		} while (bs.contentsLost());
	}
	
	protected void render(Graphics g) {
		//Draw frame rate
		g.setFont(this.appFont);
		g.setColor(this.appFPSColor);
		this.frameRate.calculate();
		
		//Draws frame rate.
		g.drawString(this.frameRate.getFrameRate(), 20, 20);
	}
	
	private void sleep(long sleep) {
		try {
			//Static - sleeps thread from which it was invoked (game thread)
			Thread.sleep(sleep);
		} catch (InterruptedException ex) {
			// ??????????
		}
	}
	
	protected void onWindowClosing() {
		try {
			//Stop loop
			this.running = false;
			//Kill game thread
			this.gameThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.exit(0);
	}
	
	protected static void launchApp( final Framework app) {
		/* Add window listener to app */
		app.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				app.onWindowClosing();
			}
		});
		
		/* Set up GUI on Event Dispatch Thread in Swing */
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				app.createAndShowGUI();
			}
		});
		
	}
	
	
	
	
	
	
	
	
	
}
