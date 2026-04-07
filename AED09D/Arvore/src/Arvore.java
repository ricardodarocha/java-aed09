public class Arvore {

    class No {
        String valor;
        No esquerda;
        No direita;

        public No(String valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    static class ArvoreBusca {
        private No raiz;

        public void inserir(String valor) {
            raiz = inserirRec(raiz, valor);
        }

        private No inserirRec(No atual, String valor) {
            if (atual == null) {
                return new No(valor);
            }

            if (valor.compareTo(atual.valor) < 0) {
                atual.esquerda = inserirRec(atual.esquerda, valor);
            } else if (valor.compareTo(atual.valor) > 0) {
                atual.direita = inserirRec(atual.direita, valor);
            }

            return atual;
        }

        public boolean buscar(String valor) {
            return buscarRec(raiz, valor);
        }

        private boolean buscarRec(No atual, String valor) {
            if (atual == null) {
                return false;
            }

            if (valor.equals(atual.valor)) {
                return true;
            }

            if (valor.compareTo(atual.valor) < 0) {
                return buscarRec(atual.esquerda, valor);
            } else {
                return buscarRec(atual.direita, valor);
            }
        }
    }


    
}
