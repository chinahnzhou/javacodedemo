package cn.java.note.lang.runtime;


public class Test {

	public static void main(String[] args) {
		Runtime.getRuntime().addShutdownHook(new Thread(){
			@Override
			public void run() {
				System.out.println("...");
			}
		});
	}

}
