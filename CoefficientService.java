import static java.lang.Math.pow;

public class CoefficientService {
    public float calculate(float percent, float month) {
        int debt = 1000000;
        float monthpercentannuitet = percent/month/debt;
        double coefficient = monthpercentannuitet * pow((1+monthpercentannuitet), month)/(pow((1+monthpercentannuitet), month) - 1);
        float payment;
        payment = (float) (coefficient * debt);
        return (payment);
    }
}
