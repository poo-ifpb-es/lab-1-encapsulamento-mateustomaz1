public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital(){
        this.hora = 12;
        this.minuto = 20;
    }

    public int getHora(){
        return this.hora;
    }

    public void setHora(int hora){
        this.hora = hora;
    }

    public int getMinuto(){
        return this.minuto;
    }

    public void setMinuto(int minuto){
        this.minuto = minuto;
    }

    public void tick(){
        if(this.hora==23){
            if (this.minuto == 59){
                this.hora = 0;
                this.minuto = 0;
            }else{
                this.minuto += 1;
            }
        }else{
            if (this.minuto == 59){
                this.hora += 1;
                this.minuto = 0;
            }else{
                this.minuto += 1;
            }
        }
    }
}
