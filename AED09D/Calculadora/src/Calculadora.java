public class Calculadora {
        public double calcularJuros(double principal, double taxa, int tempo) {
            // Simula uma operação que pode falhar se 'tempo' for zero ou negativo
            return principal * taxa * (1.0 / tempo);
        }
    }



//    Tarefa:
//
//            1. Modifique o método calcularJuros para torná-lo mais confiável. Considere:
//
//            • Validação de entrada para principal, taxa e tempo.
//
//• Tratamento de exceções (ex: IllegalArgumentException, ArithmeticException).
//
//            • Uso de encapsulamento para proteger o estado do objeto (se você expandir a classe).
//
//            2. Explique como as suas modificações aumentam a robustez e a confiabilidade do código.
//}
