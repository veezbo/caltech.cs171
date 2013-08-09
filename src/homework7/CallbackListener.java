package homework7;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.media.opengl.awt.GLCanvas;
import javax.swing.JOptionPane;

import com.jogamp.opengl.util.FPSAnimator;

/*
 * Class to handle mouse movement and key pressing
 */
public class CallbackListener implements KeyListener, MouseListener {
	
	static final int FPS = 30;
	
	final int xRes, yRes;
	Renderer r;
	GLCanvas canvas;
	FPSAnimator animator;
	
	public CallbackListener(int xRes, int yRes, Renderer r, GLCanvas canvas) {
		this.xRes = xRes;
		this.yRes = yRes;
		this.r = r;
		this.canvas = canvas;
		this.animator = new FPSAnimator(canvas, FPS, true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 27 || e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
			System.exit(0);
		if (e.getKeyChar() == 'p') {
			play();
		}
		if (e.getKeyChar() == 's') {
			stop();
		}
		if (e.getKeyChar() == 'f') {
			nextFrame();
		}
		if (e.getKeyChar() == 'r') {
			prevFrame();
		}
		if (e.getKeyChar() == 'l') {
			toggleLoopMode();
		}
		if (e.getKeyChar() == 'j') {
			String in = JOptionPane.showInputDialog("Enter an Integer Number n, 0 <= n < numFrames to go to that frame");
			try {
				int frame = Integer.parseInt(in);
				toFrame(frame);
			}
			catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Improper Input");
			}
		}
		if (e.getKeyChar() == '0') {
			toFrame(0);
		}
	}
	
	//Private Handler Functions
	private void play() {
		if (!animator.isAnimating()) {
			animator.start();
		}
	}
	private void stop() {
		if (animator.isAnimating()) {
			animator.stop();
		}
	}
	private void nextFrame() {
		r.displayNext();
	}
	private void prevFrame() {
		r.displayPrevious();
	}
	private void toFrame(int i) {
		r.displayFrame(i);
	}
	private void toggleLoopMode() {
		r.toggleLoopMode();
	}

	@Override
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
}
