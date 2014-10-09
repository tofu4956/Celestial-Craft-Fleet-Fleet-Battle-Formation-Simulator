package ccffbfs;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FBFSMain extends Frame implements ActionListener{
    public static void main(String [] args) {
        new FBFSMain();
    }
	FBFSMain() {
        super("FBFSMain");
        setSize(200, 100);
        setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自動生成されたメソッド・スタブ

	}
}