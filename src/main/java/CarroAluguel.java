public class CarroAluguel {

    private float valorPorKm;
    private int distanciaPercorrida;
    private boolean carro;
    private boolean sinistro;
    private float debito = 0;

    public CarroAluguel(Float valorPorKm){
        this.valorPorKm = valorPorKm;
        this.distanciaPercorrida = 0;
        this.carro = true;
        this.sinistro = false;
        this.debito = 0;
    }
    public void setValorPorKm(float valor){
        this.valorPorKm = valor;
    }

    public float getValorPorKm(){
        return valorPorKm;
    }

    public void setDistanciaPercorrida(int distancia){
        this.distanciaPercorrida = distancia;
    }

    public float getDistanciaPercorrida(){
        return distanciaPercorrida;
    } 

    public void alugar() throws CarroIndisponivelException{
        if(isDisponivel())
            carro = false;
        else
            throw new CarroIndisponivelException("O carro está indisponível.");
    } 

    public void devolver() throws CarroDisponivelException, CarroNaoPagoException{
        if (isDisponivel()) {
            throw new CarroDisponivelException("O carro está disponível.");
        }
        
        if (getDebito() > 0) {
            throw new CarroNaoPagoException("O carro não foi pago.");
        }

        carro = true;
        sinistro = false;
        distanciaPercorrida = 0;
    }

    public boolean isDisponivel(){
        return carro;
    } 
    
    public boolean hasSinistro(){
        return sinistro;
    } 

    public void setSinistro(boolean sinistro){
        this.sinistro = sinistro;
    }
    
    public float getDebito(){
        if (hasSinistro()){
            return (valorPorKm*distanciaPercorrida)*(1.6f);
        }
        else{ 
            return valorPorKm*distanciaPercorrida;
        }
    }
    
    public void pagar() throws CarroDisponivelException{
        if(carro){
            throw new CarroDisponivelException("O carro está disponível.");
        }distanciaPercorrida = 0;
    }
}

