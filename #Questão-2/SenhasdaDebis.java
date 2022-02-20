// # Questão 02

// Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
// A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
// O site considera uma senha forte quando ela satisfaz os seguintes critérios:

// Possui no mínimo 6 caracteres.
// Contém no mínimo 1 digito.
// Contém no mínimo 1 letra em minúsculo.
// Contém no mínimo 1 letra em maiúsculo.
// Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+

import java.util.Scanner;
import java.util.Random;

public class SenhasdaDebis {
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
Random ran = new Random();

  String[] letras ={"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
  String b = "";
  
  System.out.print("Atenção! \nSua senha deve possuir os seguintes critérios. \nConter no mínimo 1 número.\nConter no mínimo 1 letra em minúsculo.\nConter no mínimo 1 letra em maiúsculo.\nConter no mínimo 1 caractere especial. (Os caracteres especiais são: !@#$%^&*()-+)");
  

  System.out.print("\nDigite a quantidade de caracteres que dejesa em sua senha: ");
  int num = scan.nextInt();
  
  for ( int i = 0; i < num; i++){
    int a = ran.nextInt(letras.length);
	b += letras[a];
  }
  
  System.out.print("Senha gerada: " + b);
}

}
  








        
            
        
        
    
    
