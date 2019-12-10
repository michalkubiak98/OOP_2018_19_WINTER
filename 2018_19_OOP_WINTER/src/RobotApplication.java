import javax.swing.*;
import java.util.ArrayList;

public class RobotApplication {



    public static void main(String[] args) {


        ArrayList<Robot> robotTeam = new ArrayList<>();

        int choice = JOptionPane.showConfirmDialog(null, "Add another robot?");

        while(choice==JOptionPane.YES_OPTION){

            String memType = JOptionPane.showInputDialog("Please enter the memory type of the robot");
            double memSize = Double.parseDouble(JOptionPane.showInputDialog("Please enter the size of the robots memory"));

            Brain b = new Brain(memType,memSize);

            String id = JOptionPane.showInputDialog("Please enter the ID of the robot");
            int numMotors = Integer.parseInt(JOptionPane.showInputDialog("Please enter the num of motors of the robot"));

            Irobot ir = new Irobot(id, numMotors, b);

            robotTeam.add(ir);

            choice = JOptionPane.showConfirmDialog(null, "Add another robot?");

        }

        JTextArea text = new JTextArea();

        for (int i = 0; i<robotTeam.size(); i++) {

            text.append(robotTeam.get(i).toString() + "\n\n");
        }

        JOptionPane.showMessageDialog(null,text);


        //Irobot MaxMemRobot = new maxMemRobot(robotTeam);


    }
}
