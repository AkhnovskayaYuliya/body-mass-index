public class BmiService {
    public int calculate(float h, int w) {
        float bmi = w/(h*h);
        return (int) bmi;
    }


}
