package Canhao;

public class Canhao {
    private Bala bala;
    private double alcanceMaximo;


    public Canhao(Bala bala){
       this.bala=bala;
   }

    public void disparo(int velocidadeinicial, Double angulo) {
        double posicaofinal = 2*Math.pow(velocidadeinicial,2) * Math.sin(angulo)*Math.cos(angulo)*Math.sin(angulo)/9.81;
    }
    public

    
}
