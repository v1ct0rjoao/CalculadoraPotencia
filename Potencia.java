
import java.util.Scanner;

public class Potencia {
   
    //temos que saber que a potencia é como se fossse uma multiplicação do numero, 2² = 2 *2
   // nao pode usar a multiplicação do java, então vamos criar um metodo pra isso
public static int Multiplicar(int fator1, int fator2)
     {
         //precisamos fazer isso uma quantidade de vezes x, para podermos fazer a soma de tudos os elementos da multiplicação 
        // ou seja, criar um looping, loop temos for e whie e do while

        int i = 0;
        int resultado = 0; //fator comum na soma é o 0


        // for(int i = 0; i < fator2; i++)
        // {
        //    resultado += fator1;
        // }
        while(i < fator2)
        {
            
            resultado += fator1;

             i++; 
        }
        
        return resultado;
     }


     public static int Potencia(int n, int P)
     {
        
        
        int i = 0;
        int resultado = 1; //fator comum na soma é o 1


        // for(int i = 0; i < fator2; i++)
        // {
        //    resultado += fator1;
        // }
        while(i < P)
        {
            
            resultado = Multiplicar(resultado, n);

             i++; 
        }
        
        return resultado;
     }


    
    public static void main(String[] args)
    {


      Scanner leitor = new Scanner(System.in);
      int baseN;
      int expoenteP;

      System.out.println("DIGITE A BASE: ");
      baseN = leitor.nextInt();
      System.out.println("DIGITE EXPOENTE: ");
      expoenteP = leitor.nextInt();

      System.out.println(Potencia(baseN, expoenteP));
      
      
      
    
    }




    
}
