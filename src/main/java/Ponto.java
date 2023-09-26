public class Ponto {
    private double x, y;
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class Linha{
    private Ponto inicio;
    private Ponto fim;
        
    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }
    
    public Ponto getInicio() {
        return this.inicio;
    }
    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }
    public Ponto getFim() {
        return this.fim;
    }
    public void setFim(Ponto fim) {
        this.fim = fim;
    }
    public double getComprimento() {
        return Math.sqrt(Math.pow((fim.getX() - inicio.getX()), 2) + Math.pow((fim.getY()-inicio.getY()), 2));
    }
}
