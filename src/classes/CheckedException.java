package classes;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is started....");
		System.out.println("program is in progress....");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("program is finished....");
		System.out.println("program is terminated....");

	}

}
