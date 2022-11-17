public class ResolusaoDeErros {

  int expoente;
  int base;

Multiplicacao multi = new Multiplicacao();
CalculoPotencia Calculadora = new CalculoPotencia();

   public void DizerErro(int expoente, int base)
   {
      this.expoente = expoente;
      this.base = base;
   }

   public void Erro(int expoente,int base)

   {
    if(expoente == 1)
   {
      System.out.println("Expoente é igual a base: " + base);
   }
   if(expoente == 0)
   {
      System.out.println("Expoente é igual a 1");
   }
 
   else
   {
    System.out.println(Calculadora.Calculo(base, expoente));
   }
   }
 
    
}
