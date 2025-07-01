package com.parabank.parasoft.util;

public class ParaBankUtil {
    public  final static int WAIT_TIME = 20; //seconds
    public static void waitForDomStable(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}

