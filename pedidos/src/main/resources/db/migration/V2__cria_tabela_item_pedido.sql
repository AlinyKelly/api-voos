CREATE TABLE item_do_pedido (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  descricao varchar(255) DEFAULT NULL,
  quantidade int(11) NOT NULL,
  -- destino varchar(255) NOT NULL,
  -- assento varchar(5) NOT NULL,
  -- voo varchar(10) NOT NULL,
  -- tarifa double(15,2) NOT NULL,
  pedido_id bigint(20) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (pedido_id) REFERENCES pedidos(id)
)