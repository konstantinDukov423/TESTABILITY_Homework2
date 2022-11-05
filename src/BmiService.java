public class BmiService {
    public float calculate(float weight, float growth) {
        float calculate = weight / (growth * growth) ;
        return calculate;
    }
}
