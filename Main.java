public class Main {
    public static void main(String[] args) {
        float percent = (float)9.99;
        int month = 24;
        if (month == 12) {
            CoefficientService service = new CoefficientService();
            float payment = service.calculate(percent, month);
            System.out.println((int)payment);
        }
        if (month == 24) {
            CreditPaymentService service = new CreditPaymentService();
            float contribution = service.calculate(percent, month);
            System.out.println((int)contribution);
        }
        if (month == 36) {
            CreditPaymentService service = new CreditPaymentService();
            float contribution = service.calculate(percent, month);
            System.out.println((int)contribution);
        }

    }
}
