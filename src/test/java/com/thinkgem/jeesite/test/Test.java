package com.thinkgem.jeesite.test;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
@Lazy(false)
public class Test {

	@Scheduled(cron="0 0 2 * * ?")
	@org.junit.Test
	public void scyn(){
		System.out.println("执行");
	}

}
