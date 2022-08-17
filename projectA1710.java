package projectA17;

class WorkObject{
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
		
	
}
        public synchronized void methodB() {
        	System.out.println("ThreadB의 methodB");
        	notify();
        	try {
        		wait();
        	}catch(InterruptedException e) {
        		
        	}
        }
}

class ThreadA2 extends Thread{
	private WorkObject workObject;
	public ThreadA2(WorkObject workObject) {
		this.workObject=workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			this.workObject.methodA();
		}
	}
}
class ThreadB2 extends Thread{
	private WorkObject workObject;
	public ThreadB2(WorkObject workObject) {
		this.workObject=workObject;
		
	}
	@Override
	public void run() {
		
			for(int i=0;i<10;i++) {
				this.workObject.methodB();
			}
		
	}
}
public class projectA1710 {

	public static void main(String[] args) {
		WorkObject shard= new WorkObject();
		
		ThreadA2 a2=new ThreadA2(shard);
		ThreadB2 b2=new ThreadB2(shard);
		
		a2.start();
		b2.start();

	}

}
