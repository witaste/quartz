package cn.zno.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;


public class Breathe implements Job {
	

	@Override
	public void execute(JobExecutionContext context)
			throws JobExecutionException {
		System.out.println(11);
	}


}
