package homework0;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class CallbackListener implements KeyListener {

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
}
