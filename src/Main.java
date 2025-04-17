import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //definir variables en java
        //tipoDato nombre = valor;
        int[] nombre = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        if (numero >= 100){
            System.out.println("El número es mayor o igual que 100!!!");
        }

        else{
            System.out.println("No es mayor o igual que 100 :(");
        }

        for (int i=0; i<=numero; i++){
            System.out.println("Vuelta número "+ i);
        }

        System.out.println("Damos una vuelta? Si - No");
        String vuelta = sc.nextLine();
        while (vuelta.equalsIgnoreCase("si")){
            System.out.println("Damos otra vuelta? Si - No");
            vuelta = sc.nextLine();
        }



    }
}