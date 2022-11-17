
//importar a classe Scanner 
import java.util.Scanner;
public class CalculadoraDePotencia{


public static void main(String [] args){

    //Criar uma calculadora de potencia usando como metodo potenci(n e p)
    //sabemos que a potencia é a base elevado a expoente => 2² isso é a o mesmo que 2*2 
    //infelizmente nao podemos usar esses metodos, logo vamos ter que criar um metodo de multiplicação


    //criando objetos
    Scanner leitor = new Scanner(System.in);
    CalculoPotencia Calculadora = new CalculoPotencia();
    ResolusaoDeErros resposta = new ResolusaoDeErros();
    Multiplicacao multi = new Multiplicacao();

   System.out.println("Digite a base: ");
   int base = leitor.nextInt();
   System.out.println("Digite o expoente: ");
   int expoente = leitor.nextInt();
  
   resposta.Erro(expoente, base);

   
   

  



  }







}