package chapter10;

public class ChanExcDemo {
static void demoproc() {
	NullPointerException e=new NullPointerException("top layer");
	e.initCause(new ArithmeticException ("cause"));
	throw e;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			demoproc();
		}catch(NullPointerException e) {
			System.out.println("cuaght: "+e);
			System.out.println("Original cuaght: "+e.getCause());
			
		}
		}
		
	}


