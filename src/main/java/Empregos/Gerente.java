/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregos;

/**
 *
 * @author Nathan Graebin
 */
public class Gerente extends Empregado {

    public String departamento = "FINANCERIO";

   
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }
    
     public Gerente() {

    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + " DEPARTAMENTO : " + departamento;
    }

}
