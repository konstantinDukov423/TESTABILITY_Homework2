public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = (float) 1.76;
        float weight = 67;
        float BMI = service.calculate(weight, growth);
        System.out.println(BMI);

    }
}

