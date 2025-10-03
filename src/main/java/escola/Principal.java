package escola;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "João da Silva",
                "Rua das Flores, 123",
                "(11) 99999-8888",
                "joao.silva@email.com",
                "2025A001"
        );

        aluno1.exibirInfo();

        System.out.println("====================================");


        Aluno aluno2 = new Aluno(
                "Maria Souza",
                "Av. Paulista, 456",
                "(11) 98888-7777",
                "maria.souza@email.com",
                "2025A002"
        );

        aluno2.exibirInfo();
    }
}