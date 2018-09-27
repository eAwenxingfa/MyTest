package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t = new test1();
		t.start();
	}

}
class test1 extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++){
			System.out.println("Holle Word");
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}