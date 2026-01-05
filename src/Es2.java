void main() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Inserisci una parola: ");
    String par1 = scanner.nextLine();
    System.out.println("Inserisci la seconda parola: ");
    String par2 = scanner.nextLine();
    System.out.println("Inserisci la terza parola: ");
    String par3 = scanner.nextLine();

    concatenaStringhe(par1, par2, par3);

}

public static void concatenaStringhe (String p1, String p2, String p3) {
    System.out.println("Ordine corretto: " + p1 + ", " + p2 + ", " + p3);
    System.out.println("Ordine inverso: " + p3 + ", " + p2 + ", " + p1);
}
