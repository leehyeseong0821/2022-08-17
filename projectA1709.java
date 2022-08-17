package projectA17;
 
class SumThread extends Thread{
	private long sum;
	public long getSum() {
		return sum;
		
	}
	public void setSum(long sum) {
		this.sum=sum;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=100;i++) {
			sum=sum+i;
		}
	}
	
}

public class projectA1709 {

	public static void main(String[] args) {
		SumThread sum1=new SumThread();
		sum1.start();
		try {
			
			sum1.join();
		}catch(InterruptedException e) 
		{}
			System.out.println("1~100까지의합:"+sum1.getSum());
		}


}
