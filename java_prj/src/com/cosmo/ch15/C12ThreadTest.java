package com.cosmo.ch15;

class MyThread implements Runnable { //extends Thread{
	String name;
	public MyThread(String name) {
		this.name = name;
	}
//	public void run() {
////		try {
//			for(int i=0;i<10;i++) {
////				Thread.sleep(1000);
//				System.out.println("일하는 중....." + i + name);
//			}
////		} catch (InterruptedException e) {
////			e.printStackTrace();
////		}
//	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
				System.out.println("일하는 중....." + i + name);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class C12ThreadTest {

	public static void main(String[] args) {
		Runnable man1 = new MyThread("man1");
		Thread t = new Thread(man1);
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		
		t = new Thread(new MyThread("man2"));
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		
	}
}
