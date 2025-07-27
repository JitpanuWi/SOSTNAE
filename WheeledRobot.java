class WheeledRobot extends Robot{
    private int wheelCount;
    private double wearLevel;
    private double wearPerUnit;

    public WheeledRobot(String name, int wheelCount, double wearPerUnit){
        super(name);
        this.wheelCount = wheelCount;
        this.wearPerUnit = wearPerUnit;
    }

    @Override
    void moveForward(int units){
        super.moveForward(units);
        wearLevel += wearPerUnit*units;
        if (wearLevel > 0.8){
            System.out.println("Wearing Exceeds Limit");
        }
    }
    
    double getWearLevel(){
        return wearLevel;
    }
}
