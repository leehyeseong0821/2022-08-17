package projectA17;
  

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA");
	}
	
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}

class ThreadB extends Thread{
	  @Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
	
	
}

public class projectA1703 {

	public static void main(String[] args) {
	Thread main=Thread.currentThread();
	System.out.println("프로그램 시작 스레드 이름:"+main.getName());
    ThreadA A= new ThreadA();
    System.out.println("작업 스레드 이름:"+A.getName());
    A.start();
    ThreadB B=new ThreadB();
    System.out.println("작업 스레드 이름:"+B.getName());
    B.start();
	
	}

}
