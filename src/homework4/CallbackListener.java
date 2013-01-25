package homework4;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class CallbackListener implements KeyListener, MouseListener, MouseMotionListener {
	
	int savedx, savedy;
	
	Renderer r;
	
	public CallbackListener(Renderer r) {
		this.r = r;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 27 || e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
			System.exit(0);
		
		if (e.getKeyChar() == 'w') {
			r.setShading(Renderer.WIREFRAME_SHADING);
			r.canvas.display();
		}
		
		if (e.getKeyChar() == 'f') {
			r.setShading(Renderer.FLAT_SHADING);
			r.canvas.display();
		}
		
		if (e.getKeyChar() == 'g') {
			r.setShading(Renderer.GOURAND_SHADING);
			r.canvas.display();
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent m) {
		//TODO: Add in mouse transformations/rotations later
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		
	}
	
}
