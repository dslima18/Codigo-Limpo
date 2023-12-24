import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main(String[] args)
    {
       


    }
    private void printGuessStatistics(char candidate, int count)
       {
            String number;
            String verb;
            String pluralModifier;
            if(count == 0)
            {
                number ="no";
                verb ="Existem";
                pluralModifier = "s";
            }else if(count == 1)
            {
                number = "l";
                verb = "Existe";
                pluralModifier="";
            }else
            {
                number = Integer.toString(count);
                verb = "Existem";
                pluralModifier = "s";
            }
            String guessMessage = String.format("There %s %s %s%s",verb,number,candidate,pluralModifier);
            print(guessMessage);
       }
}