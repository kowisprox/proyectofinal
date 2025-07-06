
package Screens;

import TDA.*;
import javax.swing.JFrame;

public class ScreenManager {
    private static final Stack<JFrame> stack = new Stack<>();
    
    public static void openNewScreen(JFrame currentScreen, JFrame newScreen) {
        currentScreen.setVisible(false);
        stack.push(currentScreen);
        newScreen.setVisible(true);
    }
    
    public static void goBack(JFrame currentScreen) {
        currentScreen.dispose();
        stack.pop().setVisible(true);
    }
}
