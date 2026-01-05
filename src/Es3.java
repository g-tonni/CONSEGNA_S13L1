void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci il primo lato del rettangolo: ");
    double l1 = scanner.nextDouble();
    System.out.println("Inserisci il secondo lato del rettangolo: ");
    double l2 = scanner.nextDouble();

    double perimetro = perimetroRettangolo(l1, l2);
    System.out.println("Il perimetro del rettangolo è: " + perimetro);

    System.out.println("Inserisci un numero: ");
    int numScelto = scanner.nextInt();
    int pariODispari = pariDispari(numScelto);
    System.out.println("Pari o Dispari: " + pariODispari);

    System.out.println("Inserisci il primo lato del triangolo: ");
    double lt1 = scanner.nextDouble();
    System.out.println("Inserisci il secondo lato del triangolo: ");
    double lt2 = scanner.nextDouble();
    System.out.println("Inserisci il terzo lato del triangolo: ");
    double lt3 = scanner.nextDouble();

    double areaT = areaTriangolo(lt1, lt2, lt3);
    System.out.println("L'area del triangolo è: " + areaT);

}

public static double perimetroRettangolo (double num1, double num2) {
    return (num1 * 2) + (num2 * 2);
}

public static int pariDispari (int num) {
    if( num % 2 == 0) {
        return 0;
    } else {
        return 1;
    }
}

public static double areaTriangolo (double a, double b, double c){
    double p = (a + b + c) / 2;
    double numRad = p * (p - a) * (p - b) * (p - c);
    double area = Math.sqrt(numRad);
    return area;
}