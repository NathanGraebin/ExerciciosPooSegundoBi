/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empregos;

/**
 *
 * @author Nathan Graebin
 */
public class Vendedor extends Empregado {

    private float percentualComissao = 0.02f;
    public float totalGanhoComissao;
    public float totalSalario;

    public float totalVendido = 5000;

    public Vendedor(String nome, float salario) {
        super(nome, salario);
    }

    public Vendedor() {
    }

    public float calcularSalario() {
        totalGanhoComissao = (totalVendido * percentualComissao);

        totalSalario = super.getSalario() + totalGanhoComissao;
        return totalSalario;
    }

    @Override
    public String toString() {
        return "NOME : " + super.nome + " SALARIO SEM COMISSÃO R$" + super.salario + 
                " SALARIO COM COMISSÃO R$" + calcularSalario() + " ELE GANHA " + percentualComissao + "% de comissão";

    }

}
