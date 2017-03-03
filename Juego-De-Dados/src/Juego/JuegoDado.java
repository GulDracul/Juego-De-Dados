package Juego;
public class JuegoDado {
    private Dado dado1;
    private Dado dado2;
    private int resultado;
    
    public void lanzar(){
        dado1.setNumero((int) (Math.random()*6+1));
        dado2.setNumero((int) (Math.random()*6+1));
        resultado=dado1.getNumero()+dado2.getNumero();
    }
}
