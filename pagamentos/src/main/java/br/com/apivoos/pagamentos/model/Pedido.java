/*
* recuperar algum dado do microsserviço de pedidos ao fazer a consulta do pagamento
* O desafio é o seguinte: quando eu consultar um pagamento através da URI
* http://localhost:8082/pagamentos-ms/pagamentos/2 por exemplo,
* deverá listar todos os dados do pagamento e os itens que compõem o pedido referente a esse pagamento
* */
package br.com.apivoos.pagamentos.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Pedido {
    private List<ItemDoPedido> itens;

}
