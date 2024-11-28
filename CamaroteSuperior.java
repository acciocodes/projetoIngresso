public class CamaroteSuperior extends Ingresso {
    @Override
    public double valorFinal() {
        return getValor() + 80.00; // Adicional para camarote superior
    }

    @Override
    public String toString() {
        return "Camarote Superior - Preço: R$ " + valorFinal();
    }
}
