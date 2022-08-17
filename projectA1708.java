package projectA17;

class A1Thread extends Thread{
	public boolean stop =false;
	public boolean work =true;
	
	@Override
	public void run() {
	  while(!stop) {
		  if(work) {
			  System.out.println("A1Thread 작업");
		  }else {
			  Thread.yield();
		  }
	  }
	  System.out.println("A1Thread 종료");
	}
	
}
class A2Thread extends Thread{
	public boolean stop =false;
	public boolean work =true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("A2Thread 작업");
			}else {
				Thread.yield();
			}
		}
		System.out.println("A2Thread 종료");
	}
	
}

public class projectA1708 {

	public static void main(String[] args) {
		A1Thread a1= new A1Thread();
		A2Thread a2= new A2Thread();
		a1.start();
		a2.start();
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {}
		a1.work=false;
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {}
        a1.work=true;
        try {
        	Thread.sleep(3000);
        }catch(InterruptedException e) {}
        a1.stop=true;
        a2.stop=true;
	}

}
