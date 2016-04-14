
public class Driver {
	
	public static void main(String[] args) {
		
		Gathering gather = new Gathering();
		
		gather.addLiquid(15);
		gather.addSteps(10000);
		gather.addSleep(5);
		
		String test = gather.testLiquidReport("2016/04/13");
		System.out.println(test);
	}
}
