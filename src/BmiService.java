public class BmiService {
    public static int calculate(float weight, float growth) {
        float calculate = weight / (growth * growth) ;
        return (int) calculate;
    }
}
