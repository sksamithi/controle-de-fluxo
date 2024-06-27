public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = { "Felipe", "Janaina", "Thais", "Julia"};

        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        for (String aluno : alunos){//a cada execução, a variável aluno vai obter um novo valor
            System.out.println("Nome do aluno é " + aluno);
        }
    }
}
