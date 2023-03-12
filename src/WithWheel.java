public abstract class WithWheel {
    public String modelName;
    public int wheelsCount;

    public WithWheel(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }


    public abstract void updateTyre();


}
