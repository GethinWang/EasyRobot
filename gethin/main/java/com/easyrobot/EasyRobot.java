package com.easyrobot;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created with IntelliJ IDEA.
 * User: wangguoxiong
 * Date: 20-6-26
 * Time: 上午10:03
 */
public class EasyRobot extends Robot {

    private Robot robot;

    private static final String specialChar1 = ";:=+,<-_.>/?`~";

    private static final String specialChar2 = "[{\\|]}'\"";


    public EasyRobot() throws AWTException {
        robot = new Robot();
    }

    private int cnt = 0;

    public void printWords(String s) {
        char[] cs = s.toCharArray();
        robot.setAutoDelay(10);
        for (char c : cs) {
            if (c >= 'A' && c <= 'Z') {
                robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(c);
                robot.keyRelease(c);
                robot.keyRelease(KeyEvent.VK_SHIFT);
                continue;
            }
            if (c >= 'a' && c <= 'z') {
                robot.keyPress(Character.toUpperCase(c));
                robot.keyRelease(Character.toUpperCase(c));
                continue;
            }
            if (c >= '0' && c <= '9') {
                robot.keyPress(c);
                robot.keyRelease(c);
                continue;
            }
            switch (c) {
                case '!':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '@':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_2);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '#':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_3);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '$':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_4);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '%':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '^':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_6);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '&':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_7);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '*':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '(':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    cnt++;
                    break;
                case ')':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '_':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '-':
                    robot.keyPress(KeyEvent.VK_MINUS);
                    robot.keyRelease(KeyEvent.VK_MINUS);
                    break;
                case '=':
                    robot.keyPress(KeyEvent.VK_EQUALS);
                    robot.keyRelease(KeyEvent.VK_EQUALS);
                    break;
                case '+':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_EQUALS);
                    robot.keyRelease(KeyEvent.VK_EQUALS);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '`':
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    break;
                case '~':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '[':
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    cnt++;
                    break;
                case '{':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    cnt++;
                    break;
                case ']':
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    break;
                case '}':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ';':
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    break;
                case ':':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '\'':
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    break;
                case '\"':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '\\':
                    robot.keyPress(KeyEvent.VK_BACK_SLASH);
                    robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                    break;
                case '|':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_SLASH);
                    robot.keyRelease(KeyEvent.VK_BACK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ',':
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    break;
                case '<':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_COMMA);
                    robot.keyRelease(KeyEvent.VK_COMMA);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '.':
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    break;
                case '>':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_PERIOD);
                    robot.keyRelease(KeyEvent.VK_PERIOD);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '?':
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    break;
                case '/':
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ' ':
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);
                    break;
                case '\n':
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    break;
                case '\t':
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    break;
                case '\b':
                    robot.keyPress(KeyEvent.VK_BACK_SPACE);
                    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
                    break;
            }
        }
        while (cnt>0){
            robot.keyPress(KeyEvent.VK_DELETE);
            robot.keyRelease(KeyEvent.VK_DELETE);
            cnt--;
        }
    }
}