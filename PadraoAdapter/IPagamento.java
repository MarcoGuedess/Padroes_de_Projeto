public interface IPagamento {
    void setValor(double valor);
    double getValor();
    String processarPagamento();
}
