package teste2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import teste.Ponto;
import teste.Conjunto;

/**
 *
 * @author 0070354
 */
public class TestarPonto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conjunto c1 = new Conjunto(1, "c1");
        System.out.println();
        Ponto p1=new Ponto("c1",5,10);
        
        if(c1.adicionarPonto(p1)>=0){
            System.out.println("Sucesso");
        }
        else{
            System.out.println("Erro");
        }
        System.out.println(c1);
        c1.adicionarPonto(new Ponto("p2",55,11));
        System.out.println(c1);
       
        
        /*
        System.out.println("Início do programa principal");
        Ponto p1 = new Ponto(2,4);
        p1.imprimirCoordenadas();
        p1.incrementarCoordenadas(5, 2);
        p1.zerarCoordenadas();
        p1.imprimirCoordenadas();
        p1.incrementarCoordenadas(5, 2);
        p1.zerarCoordenadas();
        p1.imprimirCoordenadas();
        Ponto p2 = new Ponto(5,8);
        p2.imprimirCoordenadas();
        p2.incrementarCoordenadas(6, 9);
        p2.imprimirCoordenadas();
        p2.incrementarCoordenadas(5, 2);
        p2.imprimirCoordenadas();
        p2.zerarCoordenadas();

        /*Ponto p3 = new Ponto(0,0);
        p3.setX(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: ")));
        p3.setY(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: ")));
        JOptionPane.showMessageDialog(null, p3.toString());
        
        int x = 0;
        int y = 0;
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
            if(x >= 0 && y >= 0){
                Ponto p4 = new Ponto(x,y);
                JOptionPane.showMessageDialog(null, p4.toString());
            }
        }while(x >= 0 && y >= 0);
        

        ArrayList<Ponto> pontos = new ArrayList<>();
        int x = 0;
        int y = 0;
        do{
            x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x: "));
            y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y: "));
            if(x >= 0 && y >= 0){
                Ponto p4 = new Ponto(x,y);
                pontos.add(p4);
            }
        }while(x >= 0 && y >= 0);
        JOptionPane.showMessageDialog(null, "Total de pontos: " + pontos.size());
        for(Ponto p : pontos){
            JOptionPane.showMessageDialog(null, p.toString());
        }
*/
    }

    
}
