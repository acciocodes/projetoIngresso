public abstract class Ingresso {
    private double valor = 100.50; // Preço base
    private int categoria;

    public abstract double valorFinal();

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCategoria() {
        return this.categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    // Método principal para executar o programa
    public static void main(String[] args) {
        SistemaInterno sistema = new SistemaInterno();
        sistema.executar();
    }
}
