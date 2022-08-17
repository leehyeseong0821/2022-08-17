package projectA17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timer;
	public TimerRunnable(JLabel timer) {
		this.timer=timer;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timer.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
		
	}
	
	
}

public class projectA1702 extends JFrame {
	  public projectA1702() {
		   setTitle("Runnable을 구현한 타이머");
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   Container c = getContentPane();
		   c.setLayout(new FlowLayout());
		   JLabel timer=new JLabel();
		   timer.setFont(new Font("GOthic",Font.ITALIC,80));
		   c.add(timer);
            
		   TimerRunnable runnable = new TimerRunnable(timer);
		   Thread th = new Thread(runnable);
		   
		   setSize(250,150);
		   setVisible(true);
		   th.start();
		   
		   
		   
	  }
	
	

	public static void main(String[] args) {
		new projectA1702(); 

	}

}
