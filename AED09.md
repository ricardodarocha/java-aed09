# AED09

```
     Aluno: Ricardo da Rocha Vitor
   Periodo: 3o Periodo;
Disciplina: Linguagens de Programação
 Professor: Jacimar Tavares
     Curso: Ciência da Computação
     Turma: Unifagoc 2026 - 1
```

## Código legado

```java
public class ProcessadorDados {
    public void p(String d) {
        String[] p = d.split(",");
        double v = Double.parseDouble(p[0]);
        int q = Integer.parseInt(p[1]);
        if (v > 100 && q < 10) {
            System.out.println("A");
        } else if (v <= 100 && q >= 10) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
```

## O problema

O método `ProcessarDados.p()` possui uma complexidade média pois realiza mais de uma atividade principal, e isso causa uma sobrecarga de responsabilidades e dificulta a legibilidade e a clareza do entendimento da classe.

A implementação original realiza três processos: primeiro, separa uma string usando o caractere vírgula (",") como separador, depois converte duas variáveis V e Q em Interio e Double respectivamente, e por fim classifica esse dado em A, B ou C de acordo com uma regra de negócios específica (expressão lógica).

## Resolução

A primeira medida tomada foi a utilização de nomes mais claros para as classes, as variáveis locais e os métodos. Os parâmetros de métodos foram tratados com o prefixo p, os métodos receberam nomes de ações (verbos) e as classes receberam nome de substantivos (objetos).

A separação das responsabilidades torna o código mais organizado aumentando a legibilidade e redigibilidade. Uma classe Dado pode ser criada para encapsular estas regras de negócio, com um construtor que não seja vulnerável por receber strings que represente valores inválidos (double, integer).

Também criei um método "classificar" que depende apenas das variáveis privadas quantidade e valor

## Package default

### default.Main.java

```java

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
```

### default.Dado.java

```java
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

```

### default.ProcessamentoDados.java

```java
public class ProcessamentoDados {
    public String processarDado(String pDado) {

        String[] parametros = pDado.split(",");
        double valor = Double.parseDouble(parametros[0].trim());
        int quantidade = Integer.parseInt(parametros[1].trim());

        Dado dado = new Dado(valor, quantidade); 
        return dado.getClasse();
    }
}

```

## Atividade 2

Tarefa:

1. Implemente uma classe GerenciadorTarefas em Java que utilize as características da linguagem para promover a redigibilidade.

2. A classe deve conter os seguintes métodos:

• adicionarTarefa(String descricao): Adiciona uma nova tarefa à lista.

• removerTarefa(String descricao): Remove uma tarefa existente da lista.

• listarTarefas(): Retorna uma lista de todas as tarefas.

### default.Main.java

```java
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        GerenciadorTarefas runtime = new GerenciadorTarefas();
        runtime.adicionarTarefa("Farm gold ♦");
        runtime.adicionarTarefa("Farm stone 💎");
        runtime.adicionarTarefa("Farm food 🍖");
        runtime.adicionarTarefa("eat food 😋");
        runtime.adicionarTarefa("farm food 🍖");
        runtime.adicionarTarefa("sleep 😴💤");

        runtime.removerTarefa("sleep 😴💤");
        runtime.adicionarTarefa("never sleep ❌😴");
        runtime.listarTarefas();

    }
}
```

### default.GerenciadorTarefas.java

```java
import java.util.ArrayList;

public class GerenciadorTarefas {
    private ArrayList<String> tarefas;

    GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    void adicionarTarefa(String descricao) {
        this.tarefas.add(descricao);
    }
    void removerTarefa(String descricao) {
        this.tarefas.remove(descricao);
    }

    void listarTarefas() {
        for (String tarefa: this.tarefas) {
            System.out.println(tarefa);
        }
    }
}

```

## Atividade 3

