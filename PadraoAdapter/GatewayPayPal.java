public class GatewayPayPal {
    private double amount;

    public void pagarComPayPal(double amount) {
        this.amount = amount;
        System.out.println("Pagamento realizado via PayPal: R$" + amount);
    }

    public double getAmount() {
        return amount;
    }
}
