package Aula3.banco;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Year;

public class Sistema {
    public static void main(String[] args) {
        CaixaEletronico caixa = new CaixaEletronico();
        Aluno aluno = new Aluno();
        Conta conta = new Conta();
        LocalDate currentDate = LocalDate.now(); //pega a data completa atual do sistema
        int ano = currentDate.getYear(); //pega o ano atual do sistemta

        String senha = "";
        String senhaEscrita = ""; //criando senhaEscrita para não sobrepor a senha caso ela estivesse na linha 20
        Integer escolhaAux = 0;

        aluno.setNome(JOptionPane.showInputDialog("Bem Vindo ao banco FIAP, para entrar digite seu nome: "));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate dataN = LocalDate.parse(JOptionPane.showInputDialog("Digite sua data de Nascimento: (dd/mm/yyyy)"), formatter);

        if ((ano - dataN.getYear()) >= 18) {
            aluno.setDataNascimento(dataN);

            aluno.setCpf(JOptionPane.showInputDialog("Digite o seu CPF: "));
            aluno.setSenha(JOptionPane.showInputDialog("Digite a sua Senha: "));
            conta.setNumeroConta(); //gera número da conta
            String nConta = Integer.toString(conta.getNumeroConta()); //recebe número da conta

            JOptionPane.showMessageDialog(null, "Usuário Cadastrado!\nConta Nº " + nConta);

            senha = aluno.getSenha(); //senha cadastrada
            senhaEscrita = JOptionPane.showInputDialog("Digite a sua Senha para entrar: "); //senha da tentativa

            while (!senhaEscrita.equals(senha)) {
                JOptionPane.showMessageDialog(null, "Senha Incorreta");
                senhaEscrita = JOptionPane.showInputDialog("Digite a sua Senha para entrar: ");
            }

            do {
                Integer escolha = Integer.parseInt(JOptionPane.showInputDialog("Seja Bem Vindo " + aluno.getNome() + "\n\n1 - Sacar\n2 - Depositar\n3 - Imprimir Dados\n 0 - Sair"));
                if (escolha == 1) {
                    Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Saque: "));
                    caixa.sacar(valor);
                }
                if (escolha == 2) {
                    Float valor = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
                    caixa.depositar(valor);
                }
                if (escolha == 3) {
                    caixa.imprimirDadosConta(aluno.getNome(), aluno.getCpf(), nConta); //envia o nome, cpf e numero da conta para a CaixaEletronico
                }
                escolhaAux = escolha; //atribui o mesmo valor da escolha para o auxílio fazer a verficação abaixo
            } while (escolhaAux != 0);

        }else{
            JOptionPane.showMessageDialog(null, "Menores de idade não podem criar uma conta neste banco.");
        }
    }
}
