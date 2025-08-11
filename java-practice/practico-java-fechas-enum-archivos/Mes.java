public enum Mes {
    ENERO(1, 31),
    FEBRERO(1, 28),
    MARZO(3, 31),
    ABRIL(2, 30),
    MAYO(5, 31),
    JUNIO(6, 30),
    JULIO(7, 31),
    AGOSTO(8, 31),
    SEPTIEMBRE(9, 30),
    OCTUBRE(10, 31),
    NOVIEMBRE(11, 30),
    DICIEMBRE(12, 31);

    private int numero, cantDias;

    Mes(int numero, int cantDias) {
        this.numero = numero;
        this.cantDias = cantDias;
    }

    public boolean esLargo() {
        return cantDias == 31;
    }
}
