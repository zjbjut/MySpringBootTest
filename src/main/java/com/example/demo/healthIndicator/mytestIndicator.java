package com.example.demo.healthIndicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class mytestIndicator implements HealthIndicator {

    @Override
    public Health health() {
        int code=check();
        if(code!=0){
            return Health.down().withDetail("MYERROR code",code).build();
        }
        return Health.up().build();
    }

    private int check() {
        return 1;
    }
}
