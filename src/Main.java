public class Main {
    public static void main(String[] args) {
    //Primer ejercicio
        int numeroIf = -5;
        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        }else if (numeroIf < 0){
            System.out.println("El numero es negativo");
        }else {
            System.out.println("El numero es 0");
        }
      //Segundo ejercicio
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        //Tercer ejercicio
        int numerodowhile = 0;
        do {
            numerodowhile++;
            System.out.println(numerodowhile);
        }while (numerodowhile == 0);

        //Cuarto Ejercicio
        for (int numerofor = 0; numerofor <= 3; numerofor++){
            System.out.println(numerofor);
        }
        //Quinto ejercicio
        String estacion = "PRIMAVERA";
        switch (estacion){
            case "PRIMAVERA":
                System.out.println("Es primavera ");
                break;
            case "VERANO":
                System.out.println("Es verano");
                break;
            case "OTOÑO":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("No existe esta estación");
                break;
        }
    }
}