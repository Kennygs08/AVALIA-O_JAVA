void main(){
    int tempMedia;
    do {
        tempMedia = Integer.parseInt(IO.readln("Informe a temperatura média: "));
        if (tempMedia == 999) {
            IO.println("Temperatura inválida, informe uma temperatura válida!");
        } else if (tempMedia >= 18 && tempMedia <= 28) {
            IO.println("Temperatura Ideal");
        } else if (tempMedia > 28) {
            IO.println("Temperatura Alta: Ligar Ventilação");
        } else if (tempMedia < 18) {
            IO.println("Temperatura Baixa: Ligar o Ar");
        }

    }while (tempMedia < 18 || tempMedia > 28);
}