package interfaces;
import java.util.Scanner;
import enums.TipodeSetor;
// Cadastro de Funcionario e Animal;
public class CadFuncionarioAnimal {
    Scanner sc = new Scanner(System.in);
    private String nomeFuncionario;

    void nomeFuncionario(){
         
      System.out.println("Digite seu nome: ");
       String nomeFuncionario = sc.nextLine();


    }

    public void escolhadePadrinho(){
int escolha;
        
        System.out.println("Escolha o número do setor\n");
        System.out.println(" (1)Primata\n (2)Repteis\n (3)Aves\n (4)Mamíferos\n");
         escolha = sc.nextInt();
       
         switch (escolha) {
            case 1:
                System.out.println("Você escolheu o setor dos primatas");
                System.out.println( );
                break;
            case 2:
                System.out.println("Você escolheu o setor dos Repteis");
                break;
            case 3:
                     
                System.out.println("Você escolheu o setor das Aves");
                break;
            case 4: 
                System.out.println("Você escolheu o setor das Mamíferos");  
                break;
              
            default:
                System.out.println("Setor não encontrado");
                break;
        }
    
    }
}
    


