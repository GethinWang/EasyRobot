package com.easyrobot;

import java.awt.event.InputEvent;


public class Main {

    private static final String specialChar1 = ";:=+,<-_.>/?`~";

    private static final String specialChar2 = "[{\\|]}'\"";

    public static void main(String[] args) throws Exception {
        EasyRobot easyRobot = new EasyRobot();

        String hello = "    a\nb";
        easyRobot.mousePress(InputEvent.BUTTON1_MASK);
        easyRobot.mouseRelease(InputEvent.BUTTON1_MASK);
        easyRobot.printWords(hello);

    }

}
