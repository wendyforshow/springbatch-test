package com.spring.batch.batchtest.Controller;

import com.spring.batch.batchtest.JobListener.JobListener;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 项目：fs-fubei-shop
 * 包名：com.spring.batch.batchtest.Controller
 * 功能：
 * 时间：2017/8/22
 * 作者：PGG
 */
@RestController
@RequestMapping("/job")
public class BatchController {

    @Resource
    JobLauncher jobLauncher;

    @Resource
    Job job;

    @RequestMapping("/step")
    public void JobRun() throws JobParametersInvalidException, JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException {
        jobLauncher.run(job, new JobParameters());
    }
}
