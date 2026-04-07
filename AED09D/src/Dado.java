public class Dado {
    private double valor;
    private int quantidade;
    private String classe;

    public String getClasse() {
        return classe;
    }

    public Dado(double valor, int quantidade) {

        this.valor = valor;
        this.quantidade = quantidade;

        classificar();
    }

    private void classificar() {
        if (this.valor > 100 && this.quantidade < 10) {
            this.classe = "A";
        } else if (this.valor <= 100 && this.quantidade >= 10) {
            this.classe = "B";
        } else {
            this.classe = "C";
        }
    }
}
