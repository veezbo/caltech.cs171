package homework7;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CallbackListener implements KeyListener, MouseListener {
	
	final int xRes, yRes;
	Renderer r;
	
	public CallbackListener(int xRes, int yRes, Renderer r) {
		this.xRes = xRes;
		this.yRes = yRes;
		this.r = r;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 27 || e.getKeyChar() == 'q' || e.getKeyChar() == 'Q')
			System.exit(0);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
		
}
