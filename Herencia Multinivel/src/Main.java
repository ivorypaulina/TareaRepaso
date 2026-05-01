import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Estudiante> lista = new ArrayList<>();

    // Becado Excelencia
    System.out.println("=== Estudiante Becado Excelencia ===");
    BecadoExcelencia b = new BecadoExcelencia();

    System.out.print("Código: ");
    b.setCodigo(sc.next());

    System.out.print("Nombre: ");
    b.setNombre(sc.next());

    System.out.print("Promedio: ");
    b.setPromedio(sc.nextDouble());

    System.out.print("Matrícula: ");
    b.setValorMatricula(sc.nextDouble());

    System.out.print("Porcentaje beca: ");
    b.setPorcentajeBeca(sc.nextDouble());

    System.out.print("Bono excelencia: ");
    b.setBonoExcelencia(sc.nextDouble());

    lista.add(b);

    // Regular recargo
    System.out.println("\n=== Estudiante Regular con Recargo ===");
    RegularConRecargo r = new RegularConRecargo();

    System.out.print("Código: ");
    r.setCodigo(sc.next());

    System.out.print("Nombre: ");
    r.setNombre(sc.next());

    System.out.print("Promedio: ");
    r.setPromedio(sc.nextDouble());

    System.out.print("Matrícula: ");
    r.setValorMatricula(sc.nextDouble());

    System.out.print("Número de materias: ");
    r.setNumeroMaterias(sc.nextInt());

    System.out.print("Recargo pendiente: ");
    r.setRecargoPendiente(sc.nextDouble());

    lista.add(r);

    // Poliformismo
    System.out.println("\n=== RESULTADOS ===");
    for (Estudiante e : lista) {
      e.mostrarDatos();
      System.out.println("Pago final: $" + e.calcularPagoFinal());
      System.out.println("---------------------");
    }
  }
}