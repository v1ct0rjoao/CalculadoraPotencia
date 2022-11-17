public class CalculoPotencia {



//aqui eu vou criar um metodo para puxar o metodo Multiplicar, ja que base e potencia e quase multiplicação
//n e p é pedido na resolução n é base e p expoente
// criar um objeto da classe para chamar o metodo 
Multiplicacao multi = new Multiplicacao();


    public int Calculo(int n, int p)
    {
        //vamos fazer um loop tbm, dessa vez para multipilicar
         int resultado = 1; // o fator neutro nesse caso é o 1
        int contador = 0; 

     
         while(contador < p)
         {
            resultado = multi.Multiplicar(resultado, n); 
            // nesse caso ele vai pegar a multiplicação e fazer usando p como parametro de quantidade de vezes
            //la no outro metodo
            contador++;
         }


           return resultado;
        }

    }
    
