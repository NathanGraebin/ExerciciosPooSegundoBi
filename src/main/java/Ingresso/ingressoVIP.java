/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ingresso;

/**
 *
 * @author Nathan Graebin
 */
public class ingressoVIP extends ingresso {

    public double valorAdicional = 5.0;

    public ingressoVIP() {
    }

    public ingressoVIP(double valor) {
        super(valor);

    }
    
    

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    @Override
    public String toString() {
         
        return "INGRESSO VIP > R$ "+ (super.valor + valorAdicional);
    }
}
