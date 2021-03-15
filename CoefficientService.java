
public class CoefficientService {
    public float calculate (float percent, float month) {
        int debt = 1000000;
        float bodycreditsumm = debt/month;
        float monthpercentdiff = ((debt * percent )/ 100)/month;
        float contribution;
        contribution = bodycreditsumm + monthpercentdiff;
        return (contribution);
    }
}