public class Normal extends Ingresso {
    @Override
    public double valorFinal() {
        return getValor();
    }

    @Override
    public String toString() {
        return "Ingresso Normal - Preço: R$ " + valorFinal();
    }
}
