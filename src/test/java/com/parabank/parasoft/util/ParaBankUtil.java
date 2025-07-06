package com.parabank.parasoft.util;

public class ParaBankUtil {
    public final static int WAIT_TIME = 20; //seconds
    public final static String LOGIN_PAGE_TITLE = "ParaBank | Welcome | Online Banking";
    public static void waitForDomStable(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(e);
        }
    }


}

