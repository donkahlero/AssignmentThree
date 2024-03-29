
//Set package name
package listeners;

//Import necessary libraries
import java.awt.event.*;
import warrobots.*;
import robotwars.*;

//A listener class for performing pause and resume
public class PauseListener implements ActionListener
{
    //Private Attribute rw
    private RobotWars rw;
    //Constructor --> gets a object with the type of the main class
    public PauseListener(RobotWars rw)
    {
	//Assign the rw to the private Attribute of our class
	this.rw = rw;
    }//End PauseListener constructor

    //Method which gets executed if the button/menu item is clicked
    public void actionPerformed(ActionEvent e)
    {
	//Call the pause and resume function of the rw obj.
	rw.pause();
    }//End actionPerformed
}