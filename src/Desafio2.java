import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha");
        String senha = scanner.next();

        int digitoMaiusc = 0;
        int digitoMinusc = 0;
        int qtdeDigitos = 0;
        int caracSpecial = 0;

        if (senha.length() < 6) ;
        {
            int digitos = 6 - (senha.length());
            System.out.println(digitos);
        }
        if (senha.length() == 6) {
            System.out.println("Senha válida");
        }
        scanner.close();
    }
}

/*
PS: Eu ia construir os validadores conforme o código abaixo:

for (int i = 0; i < senha.length(); i++) {
            char C = senha.charAt(i);
            if (Character.isUpperCase(C)) {
                digitoMaiusc += 1;

Porém como no desafio só pede as informações de quantidade de digitos fiz conforme o pedido.
 */


/*
SOLUÇÃO 2

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

        System.out.println("Nome");
        String nome = scanner.next();
        System.out.println("Senha");
        String senha = scanner.next();



        System.out.println(validaSenha(senha));
    }


}
 */