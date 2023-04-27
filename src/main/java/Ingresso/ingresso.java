/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ingresso;

/**
 *
 * @author Nathan Graebin
 */
public class ingresso {

    public double valor = 50.0;

    public ingresso() {
    }

    public ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "INGRESSO BASICO R$: " + valor;
    }

}
