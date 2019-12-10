import javax.swing.*;
import java.util.ArrayList;

public class Irobot extends Robot{

    private Brain brain;

    Irobot(String id, int numMotors, Brain brain){

        super(id, numMotors);
        setBrain(brain);

    }

    public Brain getBrain() { return brain;  }

    public void setBrain(Brain brain) { this.brain = brain; }

    @Override
    public String toString() {
        return "Irobot \n" + "ID = " + getId() + "\nnumMotors= " + getNumMotors() + "\nbrain=" + getBrain();  }


    public class JTextArea maxMemRobot(ArrayList<Brain> a) {

        JTextArea text = new JTextArea();

        for (int i = 0; i < a.size(); i++) {

            if (a.get(i) instanceof Brain) {
                for (Brain r : a) {
                    double OLDMAX = r.getMemSize();

                    for (Brain b : a) {
                        double NEWMAX = b.getMemSize();

                        if (NEWMAX > OLDMAX) {
                            OLDMAX = NEWMAX;
                        }

                    }

                }
            }
        }
        return text;
    }


}


