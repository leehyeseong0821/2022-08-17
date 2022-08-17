package projectA17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimeThread extends Thread{
	private JLabel timerLable;
	public TimeThread(JLabel timerLable) {
		this.timerLable=timerLable;
	}
	
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLable.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);//1초
			}catch(InterruptedException e) {
				return;
				
			}
		}
	}
	
}


public class projectA1701 extends JFrame {
	
	public projectA1701() {
		setTitle("thread를 상속받은 타이머예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        JLabel timerLable = new JLabel();
        timerLable.setFont(new Font("Godic",Font.ITALIC,80));
        c.add(timerLable);
        TimeThread th = new TimeThread(timerLable);
        setSize(300,170);
        setVisible(true);
        th.start();
        
        
	}
	

	public static void main(String[] args) {
		new projectA1701();
	}

}
