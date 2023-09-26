public class Circulo {
    
    private float raio;
    private float pi = 3.14159f;

    public Circulo(float raio){
        this.raio = raio;
    }

    public float getRaio(){
        return this.raio;
    }

    public void setRaio(float raio){
        this.raio = raio;
    }

    public float getArea(){
        double area = Math.pow(this.raio, 2) * pi;
        return (float) area;
    }

    public float getCircunferencia(){
        float circuferencia = 2*pi*raio;
        return circuferencia;
    }
}
