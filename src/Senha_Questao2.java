import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha_Questao2 {
    
    public static boolean validaSenha(String senha) {

        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";

        Pattern p = Pattern.compile(regex);

        if (senha == null) {
            return false;
        }

        Matcher m = p.matcher(senha);

        return m.matches();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite sua senha: ");
        String senha = scanner.next();

        scanner.close();

        if(senha.length() < 6) {
            int sum = 6 - senha.length();
            System.out.print(sum);
        }
    }
}
