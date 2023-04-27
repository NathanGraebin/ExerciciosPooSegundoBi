/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ContaBancaria;

/**
 *
 * @author Nathan Graebin
 */
public class ContaEspecial extends ContaBancaria {

    public ContaEspecial(String nomeCliente, int idConta, float saldo) {
        super(nomeCliente, idConta, saldo);
    }

    private float limite;

    public void sacar() {

    }
}
