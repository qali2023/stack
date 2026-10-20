public class Regular_delivery  extends delivery{
    Regular_delivery(int Distance,int weight){
        super(Distance,weight);
    }

    @Override
    public long calculateFee() {
        return 10+(2*Distance)+weight;
    }
}
