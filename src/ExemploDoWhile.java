import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando..");

        do {
            System.out.println("Telefone tocando");
        }
        while (tocando());
        System.out.println("Alô!");
    }
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;//Eu crio um valor aleatorio de 1 a 3 e quando ele for igual a 1, significa que ele atendeu o telefone.
        System.out.println("Atendeu? " + atendeu);
        //Negando o ato de continuar tocando
        return ! atendeu;
    }
}