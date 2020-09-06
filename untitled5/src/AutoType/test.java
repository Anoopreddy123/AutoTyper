package AutoType;

import java.awt.*;
import java.awt.event.InputEvent;

class Test{
    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();

            keyboard.key("class HelloWorld {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        System.out.println(\"Hello, World!\"); \n" +
                    "    }\n" +
                    "}");

    }
}
