import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cliente {
    
    private String login;
    private String senha;

    private String nomeSobrenome;
    private String cpf;
    private String email;
    private String endereco;
    private boolean found;

    private BufferedReader read;
    private FileWriter arq;
    private Scanner scanner;
    String arquivo = "C:\\Users\\firey\\Documents\\Java\\Vs\\hello\\src\\arquivos\\User.csv";

    public Cliente(String arquivo) throws IOException{
        this.read = new BufferedReader(new FileReader(arquivo));
        this.arq = new FileWriter(arquivo, true);
        this.scanner = new Scanner(System.in);
        this.found = false;
    }

    public boolean loginVerification() throws IOException{
        String linha;
        while ((linha = read.readLine()) != null){
            if (linha.contains(getLogin() + "," + getSenha())) {
                found = true;
                break;
            }
        }
        return found;
    }

    public void createAccount() throws IOException{
        if (loginVerification() == false) {
            System.out.println("DEU ESCREVER?");
            System.out.print("Digite seu nome e Sobrenome: ");
            nomeSobrenome = scanner.nextLine();
            System.out.print("Digite seu CPF: ");
            cpf = scanner.nextLine();
            System.out.print("Digite seu Email: ");
            email = scanner.nextLine();
            System.out.print("Informe seu Endereço: ");
            String endereco = scanner.nextLine();
            arq.write(login + "," + senha + "," + nomeSobrenome + "," + cpf + "," + email + "," + endereco + "\n");
        }
        arq.close();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeSobrenome() {
        return nomeSobrenome;
    }

    public void setNomeSobrenome(String nomeSobrenome) {
        this.nomeSobrenome = nomeSobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
