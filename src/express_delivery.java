public class express_delivery  extends delivery{
    express_delivery(int Distance,int weight){
        super(Distance,weight);
    }


    @Override
    public long calculateFee() {
        return 25+(4*Distance)+(2*weight);
    }
}
