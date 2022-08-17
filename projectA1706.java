package projectA17;
class Calculator1{
	
	private int memory;
	
	public int getMemory() {
		return memory;
		
	}
	
	public synchronized void setMemory(int memory) {
		this.memory=memory;
		try {
			Thread.sleep(2000);
			
		}catch(InterruptedException e) {
			
			
		}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
	
}
class User extends Thread{
	private Calculator1 calculator;
	public void setCalculator1(Calculator1 calculator) {
		this.setName("User1");
		this.calculator=calculator;
		
	} 
	@Override
	public void run() {
	  calculator.setMemory(100);
	}
	
}
class User1 extends Thread{
	private Calculator1 calculator;
	public void setCalculator1(Calculator1 calculator) {
		this.setName("User2");
		this.calculator=calculator;
		
	}
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}


public class projectA1706 {

	public static void main(String[] args) {
		Calculator1 calculator = new Calculator1();
		
		User us= new User();
		us.setCalculator1(calculator);
		us.start();
		
		User1 us1=new User1();
		us1.setCalculator1(calculator);
		us1.start();

	}

}
