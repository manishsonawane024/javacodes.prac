
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class KeyListenerExample extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}

	public void paint(Graphics g){
		g.drawString(msg,10,10);
	}
	
	public void keyPressed(KeyEvent e) {
		showStatus("Key Pressed");
		repaint();
	}
	
	public void keyReleased(KeyEvent e) {
		showStatus("Key Released");
		repaint();
	}
	
	public void keyTyped(KeyEvent e) {
		showStatus("Key Typed");
		repaint();
	}
	
}
