package Practice;

public class Trycatch extends Exception{
	Trycatch(String str){
		super(str);
	}

	public static void main(String[] args) {
	
		int x=3;
	try {
		if(x/0==1) {
			System.out.println("Result");
		}else {
			throw new Trycatch("0 cannot divide");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("Mithun");
	}
		

	}

}
