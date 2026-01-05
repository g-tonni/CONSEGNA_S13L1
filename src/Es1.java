void main (){
    int operazione = moltiplica(2, 3);
    System.out.println(operazione);

    String frase = concatena("Il numero è: ", 3);
    System.out.println(frase);

    String[] nomi = {"Giada", "Diego", "Giorgia", "Luca", "Martina"};
    String parolaAggiunta = "Pierluca";

    String[] arrayAllungato = inserisciInArray(nomi, parolaAggiunta);
    for(int i = 0; i < arrayAllungato.length; i++){
       System.out.println(arrayAllungato[i]);
    }
}

public static int moltiplica(int num1, int num2) {
    return num1 * num2;
}

public static String concatena(String stringa, int num) {
    return stringa + num;
}

public static String[] inserisciInArray (String[] array, String agg) {
    String[] nuovoArray = new String[6];
    nuovoArray[0] = array[0];
    nuovoArray[1] = array[1];
    nuovoArray[2] = agg;
    nuovoArray[3] = array[2];
    nuovoArray[4] = array[3];
    nuovoArray[5] = array[4];

    return nuovoArray;
}