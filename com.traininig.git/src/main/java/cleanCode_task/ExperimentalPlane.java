package cleanCode_task;


public class ExperimentalPlane extends Plane{

    private ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane (String model) {
        super(model);
    }

    public ExperimentalPlane (int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        super(maxSpeed, maxFlightDistance, maxLoadCapacity);
    }

    public ExperimentalTypes getType() {
        return type;
    }

    public void setType(ExperimentalTypes type) {
        this.type = type;
    }

    public ClassificationLevel getClassificationLevel(){
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel){
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}
