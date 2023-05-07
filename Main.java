public class Main {


    public static void main(String[] args) {
        Conta conta = new Conta ();
        conta.nome = "Thamiriz Christine Bernardes da Costa";
        conta.dataDeNascimento = "11/02/92";
        conta.idade = "31 anos";
        conta.mensagem = "Sou nova no ramo de desenvolvimento, mas tenho muita vontade de aprender!";

        System.out.println("\nNome: " + conta.nome);
        System.out.println("\nData de Nascimento: " + conta.dataDeNascimento);
        System.out.println("\nIdade: " + conta.idade);
        System.out.println("\nMensagem: " + conta.mensagem);

    }
}