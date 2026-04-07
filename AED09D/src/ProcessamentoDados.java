public class ProcessamentoDados {
    public String processarDado(String pDado) {

        String[] parametros = pDado.split(",");
        double valor = Double.parseDouble(parametros[0].trim());
        int quantidade = Integer.parseInt(parametros[1].trim());

        Dado dado = new Dado(valor, quantidade);
        return dado.getClasse();
    }
}
