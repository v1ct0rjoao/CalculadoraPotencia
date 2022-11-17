public class Multiplicacao {
    




    //a multiplicação é a soma de fatores n vezes => 9*2 é o mesmo que 9 +9 = 18
    //certo? entao podemos uma um loop para isso
    //vamos criar um metodo certo
    //2² = 2*2
    
    


    public int Multiplicar(int fator1, int fator2)
    {
        //dentro desse metodo de retorno int vamos criar o loop
         int contador = 0;
         int resultado = 0; // fator comum na soma é 0
        while(contador < fator2)
        {

          resultado += fator1; //aqui vai ter uma soma de acordo com a quantidade de vezes do fator 2
           contador++; //contador++ para somar ate que seja maior que fator 2


        }
       
        return resultado;


    }
}
