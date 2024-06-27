package Collections;

//public class practicse  {
	
//	public static void main(String args[])
//	{
//	int i=0, j=2;
//
//	do
//	{
//	i=++i;j--;
//	}
//	while(j>=0);
//
//	System.out.println(i);
//	}}
//	public class Test implements Runnable {
//
//	    public static void main(String[] args) throws Exception {
//	        Thread t = new Thread(new Test());
//	        t.start();
//	        System.out.print("Started ");
//
//	       // t.join();
//
//	        System.out.print(" Complete");
//	    }
//
//	    public void run() {
//	        for (int i = 0; i < 40; i++) {
//	            System.out.print(i);
//	        }
//	    }
//	}

public class ArrayCopyOfDemo {

    public static void main(String[] args) {
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
        System.out.println(new String(copyTo));
    }
}