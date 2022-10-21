/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teste;

/**
 *
 * @author 0070354
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto(String p2, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
     public void incrementarCoordenadas(int deltaX, int deltaY){
        x = x + deltaX;
        y = y + deltaY;
    }

    public void imprimirCoordenadas(){
        System.out.println(toString());
    }

    public void zerarCoordenadas(){
        x = 0;
        y = 0;
    }
    
    public Ponto(int x1, int y1){
        x = x1;
        y = y1;
    }

    @Override
    public String toString() {
        return "Ponto{" + "x=" + x + ", y=" + y + '}';
    }
 
    
}
