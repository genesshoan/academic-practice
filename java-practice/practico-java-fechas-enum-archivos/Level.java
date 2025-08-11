public enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int prioridad;

    Level (int prioridad) {
        this.prioridad = prioridad;
    }

    public boolean isCritical() {
        return prioridad == 3;
    }
}
