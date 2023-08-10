public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int w = 98;
        float h = 1.87F;
        int bmi = (int) service.calculate(h,w);

        System.out.println("Индекс массы тела:" + (int) bmi);

    }
}