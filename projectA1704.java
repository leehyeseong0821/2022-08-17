package projectA17;

class Calc extends Thread{
	public Calc(String name) {
	   this.setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<2000000000;i++) {
			
		}
		try {
		Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			
		}
		System.out.println(this.getName());
		
	}
	
	
}

public class projectA1704 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread th=new Calc("Thread"+i);
			if(i!=10) {
				th.setPriority(Thread.MIN_PRIORITY);
			}else {
				th.setPriority(Thread.MAX_PRIORITY);
			}
			th.start();
			
		}

	}

}
