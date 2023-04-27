/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregos;

/**
 *
 * @author Nathan Graebin
 */
public class Empregado {
    public String nome = "Nathan";
    protected float salario = 2500;

    public Empregado(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }
    public Empregado(){}

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "NOME : " + nome + "  SALARIO : " + salario;
    }
        
}
