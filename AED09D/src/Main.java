
public class Main {
    public static void main(String[] args) {
        //Acesse Editar Configurações, Run, Argumentos da aplicação
        ProcessamentoDados processamento = new ProcessamentoDados();
        String classe1 = processamento.processarDado(args[0]);
        System.out.println(classe1);

        //Teste 2 - informe os argumentos manualmente
        ProcessamentoDados processamento2 = new ProcessamentoDados();
        String classe2 = processamento2.processarDado("123,23");
        System.out.println(classe2);

    }

}