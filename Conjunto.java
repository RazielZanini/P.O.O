/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestarPonto;
import java.util.ArrayList;
/**
 *
 * @author 0070354
 */
public class Conjunto {
    private int codigo;
    private String descricao;
    private ArrayList listaPontos;

    public Conjunto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.listaPontos = new Arraylist();
        
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ArrayList getListaPontos() {
        return listaPontos;
    }

    public void setListaPontos(ArrayList listaPontos) {
        this.listaPontos = listaPontos;
    }

    @Override
    public String toString() {
        return "Conjunto{" + "codigo=" + codigo + ", descricao=" + descricao + ", listaPontos=" + listaPontos + '}';
    }

    public int adicionarPonto(Ponto ponto){
        listaPontos.add(ponto);
        return +1;
    }
    
    public void excluirPonto(Ponto ponto){
        //exclui o objeto ponto do ArrayList
    }
    
    public void listarPontos(){
        Ponto p=null;
        System.out.println("Inicio listarPontos");
        if(listaPontos!=null){
            for(int i =0;i<listaPontos.size();i++){
                p=(Ponto)listaPontos.get(i);
                System.out.println(p);
            }
            System.out.println("Fim listarPontos");
        }
    }
}
