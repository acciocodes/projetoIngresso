public class CamaroteInferior extends Ingresso {
    private String localizacao;

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public double valorFinal() {
        return getValor() + 50.00; // Adicional para camarote inferior
    }

    @Override
    public String toString() {
        return "Camarote Inferior - Preço: R$ " + valorFinal() + ", Localização: " + localizacao;
    }
}
