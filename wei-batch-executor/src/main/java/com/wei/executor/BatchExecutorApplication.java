package com.wei.executor;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author wei
 */
@SpringCloudApplication
public class BatchExecutorApplication {
    public static void main(String[] args) {
        SpringApplication.run(BatchExecutorApplication.class, args);
    }
}
