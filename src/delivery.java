public abstract class delivery {
    protected int Distance;
    protected int weight;

    delivery(){
        Distance=0;
        weight=0;

    }

    public delivery(int distance, int weight) {
        Distance = distance;
        this.weight = weight;
    }
    public abstract long calculateFee();
}
