public class EstudianteBecado extends Estudiante {
    protected double porcentajeBeca;

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100)
            this.porcentajeBeca = porcentajeBeca;
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() * (1 - porcentajeBeca / 100);
    }
}