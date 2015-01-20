//コードの汚さは一人前

package net.tofu4956.ccffbfs;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class FBFSMain extends Frame implements ActionListener{
    @Override
	public synchronized void addWindowListener(WindowListener l) {
		// TODO 自動生成されたメソッド・スタブ
		super.addWindowListener(l);
	}
	public static void main(String [] args) {
       FBFSWindow ccf = new FBFSMain();
    }
	FBFSMain() {
        super("FBFSMain");
        setSize(920,600);
        setVisible(true);
    }
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
	
}