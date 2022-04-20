import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner (System.in);
        int n, res= 0;
        App obj = new App();
        System.out.println("Escriba un número: ");
        n = entrada.nextInt();
        System.out.println("Resultado = "+obj.invierte(n,res));
        
    }

    /*public static int sumaN(int n) {
        if(n==1)
            return n;
        else
            return n+sumaN(n-1);
    }*/
    public int invierte(int n, int res){
        int residuo = 0;
        if(n==0){
            return res;
        }   else{
            residuo = n % 10;
            n = n/10;
            res=(res*10)+residuo;
            return invierte(n,res);
        }
            
    }
}