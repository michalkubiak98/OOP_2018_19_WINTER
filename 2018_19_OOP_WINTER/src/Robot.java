public class Robot {

    private String id;
    private int numMotors;

    public Robot() {
        setId("Unknown");
        setNumMotors(0);
    }

    public Robot(String id, int numMotors) {
        setId(id);
        setNumMotors(numMotors);
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumMotors() {
        return numMotors;
    }

    public void setNumMotors(int numMotors) {
        this.numMotors = numMotors;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "id='" + getId() + '\'' +
                ", numMotors=" + getNumMotors() +
                '}';
    }
}
