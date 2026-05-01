public class EstudianteRegular extends Estudiante {
    protected int numeroMaterias;

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0)
            this.numeroMaterias = numeroMaterias;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }
}