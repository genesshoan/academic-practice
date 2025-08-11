import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;

public class FechaActual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha Actual: " + fechaActual);
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora Actual: " + horaActual);
        LocalDateTime fechaHoraActual = LocalDateTime.of(fechaActual, horaActual);
        System.out.println("Fecha Hora Actual: " + fechaHoraActual);

        System.out.print("Fecha de nacimiento: ");
        LocalDate fechaNacimiento = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println(Period.between(fechaNacimiento, LocalDate.now()).getDays());
        System.out.println(ChronoUnit.YEARS.between(fechaActual, fechaNacimiento));

        System.out.println(fechaActual.plusDays(100));
    }
}
