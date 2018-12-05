/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcp;

import estoque.Produto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JP
 */
public class Receita {

    private String nome;
    private List<Produto> ingredientes;
    private String modoPreparo;
    private int equipeMinima;
    
     public Receita() {
        this.ingredientes = new ArrayList<>();
    }

    public Receita(String nome, List<Produto> ingredientes, String modoPreparo, int equipeMinima) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.equipeMinima = equipeMinima;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Produto> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Produto> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    } 

    public int getEquipeMinima() {
        return equipeMinima;
    }

    public void setEquipeMinima(int equipeMinima) {
        this.equipeMinima = equipeMinima;
    }
}