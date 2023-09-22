import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector=new Scanner(System.in);
        int menu, intentos=3;

        System.out.println("Bienbenid@/s");
        System.out.println("Menú");
        System.out.println("1. Igualdad de dos matrices");
        System.out.println("2. Suma de dos matrices");
        System.out.println("3. Una matriz nxm con todos los elementos 0");
        System.out.println("4. Inverso aditivo de una matrix nxm");
        System.out.println("5. Resta de dos matrices");
        System.out.println("6. Multiplicación de un escalar por una matriz nxm");
        System.out.println("7. Multiplicación de dos matrices compatibles");
        System.out.println("8. Matriz identidad de tamaño n");
        System.out.println("9. Matriz inversa de tamaño n");
        System.out.println("10. El determinante de una matriz de tamaño n");
        System.out.println("11. Salir");

        do{
            System.out.print("Ingrese una opción");
            menu=lector.nextInt();
            if(menu<=0 || menu>11){
                intentos--;
                System.out.println("Ingrese una opción valida");
            }
            if(intentos<=0){
                System.out.println("Has alcanza el limete de intentos");
                break;
            }
        }while(menu<=0 || menu>11);

        switch(menu){
            case 1->{
                System.out.println("1. Igualdad de dos matrices");
            }
            case 2->{
                System.out.println("2. Suma de dos matrices");
            }
            case 3->{
                System.out.println("3. Una matriz nxm con todos los elementos 0");
            }
            case 4->{
                System.out.println("4. Inverso aditivo de una matrix nxm");
            }
            case 5->{
                System.out.println("5. Resta de dos matrices");
            }
            case 6->{
                System.out.println("6. Multiplicaciónn de un escalar por una matriz nxm");
            }
            case 7->{
                System.out.println("7. Multiplicación de dos matrices compatibles");
            }
            case 8->{
                System.out.println("8. Matriz identidad de tamaño n");
            }
            case 9->{
                System.out.println("9. Matriz inversa de tamaño n");
            }
            case 10->{
                System.out.println("10. El determinante de una matriz de tamaño n");
            }
            case 11->{
                System.out.println("11. Salir");
                System.out.println("Muchas gracias por usar nuestros servicios");
                System.out.println("Esperamos volver a verl@/s luego");
                System.out.println(":D");
            }
            
        }
        
                
    }
}
