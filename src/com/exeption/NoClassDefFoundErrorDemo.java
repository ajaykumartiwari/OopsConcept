package com.exeption;

public class NoClassDefFoundErrorDemo {

	public NoClassDefFoundErrorDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
            // The following line would throw ExceptionInInitializerError
			//Class.forName("oracle.jdbc.driver.OracleDriver");
            SimpleCalculator calculator1 = new SimpleCalculator();
        } catch (NoClassDefFoundError t) {
            System.out.println(t);
        }
        // The following line would cause NoClassDefFoundError
        SimpleCalculator calculator2 = new SimpleCalculator();
	}

}
