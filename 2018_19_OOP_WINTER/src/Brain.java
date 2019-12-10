public class Brain {

    private String memType;
    private double memSize;

    public Brain(String memType, double memSize) {
        this.memType = memType;
        this.memSize = memSize;
    }



    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    public double getMemSize() {
        return memSize;
    }

    public void setMemSize(double memSize) throws IllegalArgumentException {

        double maxMemSize  = 1000;

        if(memSize < 0 ){
            throw new IllegalArgumentException(String.format("Mem Size Has To Be Positive"));
        }




        if(memSize > maxMemSize){
            throw new IllegalArgumentException(String.format("MemSize [%d] exceeds maximum MemSize [%d].",
                                                                    memSize, maxMemSize));
        }

        this.memSize = memSize;
    }

    @Override
    public String toString() {
        return "Brain \n" + "memType = " + getMemType() + "\nmemSize = " + getMemSize();

    }
}
