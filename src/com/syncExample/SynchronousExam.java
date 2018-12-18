/**
 * 
 */
package com.syncExample;

/**
 * @author 26647
 *
 */
public class SynchronousExam {

	private OnEventListener onEventListener;
	
	public void registerOnEventListerne(OnEventListener onEventListener) {
		
		this.onEventListener = onEventListener;
	}
	
	//synchronous  method
	public void doSomething() {
		System.out.println("performing callback before synchronpous task!");
		
		//check if listener is register
		if(this.onEventListener != null) {
			// invoke call back method of class SynchronousExam 
			onEventListener.onEvent();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronousExam start = new SynchronousExam();
		OnEventListener onEventListener = new Start();
		start.registerOnEventListerne(onEventListener);
		start.doSomething();
	}
}
