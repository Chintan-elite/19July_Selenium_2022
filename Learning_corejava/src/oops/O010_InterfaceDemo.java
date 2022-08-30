package oops;

interface I1
{
	public void sample();
}
interface I2
{
	public void run();
}

class InterImpl implements I1,I2
{

	@Override
	public void sample() {
		
		System.out.println("Running inter class sample method...");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

public class O010_InterfaceDemo {
	public static void main(String[] args) {
		
		InterImpl i = new InterImpl();
		i.sample();
	}
}
