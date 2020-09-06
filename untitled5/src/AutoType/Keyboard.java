package AutoType;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.security.Key;

public class Keyboard {
    Robot robot;
    public Keyboard(){

        try {
           robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    public void key(String s){
       byte b[] = s.getBytes();
            int code;
            for(int i=0;i<b.length;i++ ) {
                   code=b[i];
                if(code>=65&&code<=90) {


                    robot.delay(100);
                    robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    robot.keyRelease(KeyEvent.VK_CAPS_LOCK);
                    robot.keyPress(code);
                    robot.keyRelease(code);
                    robot.keyPress(KeyEvent.VK_CAPS_LOCK);
                    robot.keyRelease(KeyEvent.VK_CAPS_LOCK);

                }
               else if(code>=97&&code<=122){
                    code=code-32;
                    robot.delay(100);
                    robot.keyPress(code);
                    robot.keyRelease(code);

                }

               else if(code==59)
                {

                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);


                }
                else if(code==123){
                    robot.delay(200);
                 robot.keyPress(KeyEvent.VK_SHIFT);
                 robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                 robot.keyRelease(KeyEvent.VK_SHIFT);
                 robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);

                }
                else if(code==125){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                }
               else if(code == 32){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SPACE);
                    robot.keyRelease(KeyEvent.VK_SPACE);

                }
               else if(code == 10){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                }
               else if(code>=0&&code<=9){
                    robot.delay(200);
                   robot.keyPress(code);
                    robot.keyRelease(code);
               }
               else if(code==40){
                    robot.delay(200);
                   robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_9);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_9);



                }
               else if(code == 91){
                    robot.delay(200);
                   robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
                }

                else if(code == 93){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
                }
                else if(code == 41 ){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_0);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_0);
                }
                else if(code == 61){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_EQUALS);
                    robot.keyRelease(KeyEvent.VK_EQUALS);
                }
                else if(code == 34){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_QUOTE);
                }
                else if(code == 44 )
                {
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_COMMA);
                }
                else if(code == 46){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_PERIOD);
                }
                else if(code == 63){
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_SLASH);
                }
                else if(code == 42){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_8);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_8);
                }
                else if(code == 58){
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SEMICOLON);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_SEMICOLON);
                }
                else if(code == 33){
                    robot.delay(200);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_1);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_1);
                }
               else
                {
                    System.out.println("Error");
                }
                

         }

    }
}
