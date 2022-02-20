import java.util.Arrays;
import java.util.Scanner;

public class TesteAnagrama {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String s, r;
        int i, j;
        System.out.println("Digite duas palavras para verificarmos se trata-se de um anagrama:");
    s = ent.nextLine();
    r = ent.nextLine();
    var a = s.toCharArray();
    char[] b = r.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    if (Arrays.equals(a, b)) {
        System.out.println("É Anagrama");
        System.out.println(a);
        System.out.println(b);
    } else {
        System.out.println("Não é Anagrama");
    }
    }

}



