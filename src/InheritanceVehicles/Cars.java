package InheritanceVehicles;

public class Cars extends Vehicles{
    int oneway_count = 0;

    Cars(int oneway_count){
        this.oneway_count = oneway_count;
    }

    public int speed(int kms, int hours){
        int result = ((kms/ hours) + oneway_count);
        System.out.println("speed :" + result);
        return result;
    }


}
