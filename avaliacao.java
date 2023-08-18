import java.util.Scanner;

class Avaliacao {

    String nome;
    Double nota1;
    Double nota2;
    Double nota3;
    Double nota4;

    public Avaliacao(String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
  
    public String verificarAprovacao() {
        double media = calcularMedia();
        if (media < 4.1) {
            return "Reprovado";
        } else if (media < 7.1) {
            return "Recuperação";
        } else {
            return "Aprovado";
        } 
        }
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        Avaliacao avaliacao = new Avaliacao(nome, nota1, nota2, nota3, nota4);

        System.out.println("Nome do Aluno " + nome + " média do aluno " + avaliacao.calcularMedia() + " situação do aluno " + avaliacao.verificarAprovacao() );
    }

 

}