package aplicacion;
import java.util.Scanner;
import dominio.ej2_1_lambda;

public class Principal {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(ej2_1_lambda.suma(n));
    }

}
