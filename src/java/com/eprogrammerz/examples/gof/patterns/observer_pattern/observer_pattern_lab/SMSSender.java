package com.eprogrammerz.examples.gof.patterns.observer_pattern.observer_pattern_lab;

/**
 * Created by ${YogenRai} on 3/26/2016.
 */
public class SMSSender implements SystemService {
    public void provideService(){
        System.out.println("SMS sent.");
    }
}
