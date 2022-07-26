package com.xkcoding.async.service;

import com.xkcoding.async.task.TaskFactory;
import java.util.concurrent.Future;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * TestService
 *
 * @author lallaluo
 * @time 2022/7/26 13:16:16
 */

@Service
public class TestService {

    @Autowired
    private TaskFactory taskFactory;

    @Scheduled(fixedDelay = 20000)
    public void test() {
        try {
            Future<Boolean> booleanFuture = taskFactory.asyncTask1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
