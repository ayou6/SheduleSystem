package com.example.ScheduleSystem;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Schedule {
    @Scheduled (cron ="0 */120 22-6 * * *")



    public void ScheduleTest(){
        System.out.println("Wassup!!");

    }
}
