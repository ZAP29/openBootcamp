/* 
->Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    Pista: Los números inferiores a 0 son negativos y los superiores, positivos.

->Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
    Incrementar el valor de la variable en uno cada vez que se ejecute.
    Mostrarlo por pantalla cada vez que se ejecute.

->Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

->Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o 
    menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

->Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. 
    Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.
*/


public class estructuras{

    public static void main(String[] args) {
        
        int numeroIf = 0;

        if (numeroIf > 0){
            System.out.println("Es positivo");
        } 
        else if (numeroIf == 0){
            System.out.println("El numero es 0");
        }
        else{
            System.out.println("El numero es negativo");
        }

        int numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println("Numero while: " + numeroWhile);
        }

        do {
            numeroWhile = 3;
            System.out.println(numeroWhile);
        } while (numeroWhile<3);

        int numeroFor = 0;

        for (int i = 0; i <= 3; i++){
            
            System.out.println("Numero for: " + numeroFor);
            numeroFor++;
        }

        int estacion = 2;

        switch (estacion){
            case 1:
            System.out.println("Invierno");
            break;                
            case 2:
            System.out.println("Verano");
            break;
            case 3:
            System.out.println("Otoño");
            break;
            case 4:
            System.out.println("Primavera");
            break;
            default:
                System.out.println("Numero de estacion invalido");
                break;
        }
    }

}