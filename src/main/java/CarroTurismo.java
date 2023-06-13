public class CarroTurismo {
    private double voltas;
    private double tempo;

    public double getVoltas() {
        return voltas;
    }

    public void setVoltas(double voltas) {
        this.voltas = voltas;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double calcularNota() {
        return Organizacao.calcularNota(this.voltas, this.tempo);
    }
}