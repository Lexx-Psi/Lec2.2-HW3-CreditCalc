public class CreditPaymentService {
    public float calculate(float percent, float month) {
        int debt = 1000000;
        float bodycreditsumm = debt/month;
        float monthpercentdiff = (100 * percent)/debt;
        float contribution;
        contribution = monthpercentdiff + bodycreditsumm;
        return (contribution);
    }
}
