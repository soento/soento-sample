package com.soento.sample.business.a.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestHandlerJob {
    private static Logger logger = LoggerFactory.getLogger(TestHandlerJob.class);

    @Autowired
    private TaskExecutor executor;

    @Scheduled(fixedRate = 1000 * 60 * 3)
    public void execute() {
        logger.info("============ start ===============");
        executor.execute(new Runnable() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss SSS");
                logger.info("test job execute : " + sdf.format(new Date()));
//                for (int i = 0; i < 1000000000; i++) {
//                    logger.info("" + i++);
//                }
            }
        });
        logger.info("============ end ===============");
    }
}
