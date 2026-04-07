public class Main {
    public static void main(String[] args) {

        Arvore.ArvoreBusca arvore = new Arvore.ArvoreBusca();
        // Inserindo dados
        for (int i = 0; i < 100000; i++) {
            arvore.inserir("item" + i);
        }

        long inicio = System.nanoTime();
        boolean encontrado = arvore.buscar("item99999");
        long fim = System.nanoTime();

        System.out.println("Elemento encontrado: " + encontrado);
        System.out.println("Tempo de busca (ns): " + (fim - inicio));
    }
}