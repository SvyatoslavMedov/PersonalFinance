package personalfinance;

import personalfinance.settings.Settings;
import personalfinance.settings.Text;

import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonalFinance {

    public static void main(String[] args) {
        init();
        System.out.println("\\\\");
//        System.out.println(Text.get("PROGRAMM_NAME"));
//        System.out.println(Arrays.toString(Text.getMonths()));
	// write your code here
    }

    private static void init (){
        try{
            Settings.init();
            Settings.save();
            Text.init();
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT_ROBOTO_LIGHT));
        }catch (FontFormatException | IOException ex) {
            Logger.getLogger(PersonalFinance.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
