package cn.zno.job;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Breathe {
	{
		System.out.println("我被构造了"+Thread.currentThread());
	}
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public void breatheIn() throws InterruptedException{
		System.out.println(Thread.currentThread() + sdf.format(new Date())+" IN");
	}
	
	public void breatheOut() throws InterruptedException{
		System.out.println(Thread.currentThread() + sdf.format(new Date())+" OUT");
	}

}
