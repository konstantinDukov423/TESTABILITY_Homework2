public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float growth = 1.76F;
        int weight = 67;
        float BMI = service.calculate(weight, growth);
        System.out.printf("%.1f", BMI);

    }
}

