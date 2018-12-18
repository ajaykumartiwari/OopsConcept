package com.asyncExam;

import com.syncExample.OnEventListener;
import com.syncExample.Start;
import com.syncExample.SynchronousExam;

public class ASynchronousExam {

	private OnEventListener onEventListener;
	
	public void registerOnEventListener(OnEventListener onEventListener) {
		this.onEventListener = onEventListener;
	}
	
	public void doSomethings() {
	
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Performing Asynchronous operation!!");
				
				if(onEventListener != null) {
					onEventListener.onEvent();
				}
			}
		});
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronousExam start = new SynchronousExam();
		OnEventListener onEventListener = new Start();
		start.registerOnEventListerne(onEventListener);
		start.doSomething();
		
	}

}
