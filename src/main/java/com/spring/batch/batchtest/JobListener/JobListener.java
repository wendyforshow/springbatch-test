package com.spring.batch.batchtest.JobListener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * 项目：fs-fubei-shop
 * 包名：com.spring.batch.batchtest.JobListener
 * 功能：
 * 时间：2017/8/22
 * 作者：PGG
 */
public class JobListener implements JobExecutionListener {
    long startTime;
    long endTime;

    @Override
    public void beforeJob(JobExecution jobExecution) {
        startTime = System.currentTimeMillis();
        System.out.println(startTime + "任务处理开始...........");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        endTime = System.currentTimeMillis();
        System.out.println("任务处理结束...........");
        System.out.println("耗时:" + (endTime - startTime) + " ms");
    }
}
