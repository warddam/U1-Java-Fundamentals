import jdk.nashorn.internal.scripts.JO;

import javax.swing.JOptionPane;

public class L9{

    public static void main(String[] args) {

        String firstname;
         String lastname;

         firstname = JOptionPane.showInputDialog("What is your first name?");
         lastname = JOptionPane.showInputDialog("What is your last name?");

                 JOptionPane.showMessageDialog(null, "Hello " + firstname + " " + lastname + "!!");
                 System.exit(0);

                 //ALL INPUT IS RECEIVED AS A STRING

        //PRO TIP: Variables of the same data type can be separated with a coma in the declaration

        int mph, minutes;
        double distance, hours;

        mph = Integer.parseInt(JOptionPane.showInputDialog("How fast were you traveling (in MPH?"));
        minutes = Integer.parseInt(JOptionPane.showInputDialog("How long, in minutes, were you traveling?"));

                hours = minutes/60.0;
distance = mph * hours;

JOptionPane.showMessageDialog(null, "You travelled " + distance + " miles.");
    }



}
