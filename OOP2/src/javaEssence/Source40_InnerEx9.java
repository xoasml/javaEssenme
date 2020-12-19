package javaEssence;

import java.awt.*;
import java.awt.event.*;

class Source40_InnerEx9 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

//class EventHandler extends WindowAdapter {
//	public void windowClosing(WindowEvent e) {
//		e.getWindow().setVisible(false);
//		e.getWindow().dispose();
//		System.exit(0);
//	}
//}
