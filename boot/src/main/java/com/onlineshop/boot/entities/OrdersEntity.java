package com.onlineshop.boot.entities;

import com.onlineshop.boot.utils.Schemas;
import com.onlineshop.boot.utils.constants.Tables;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = Tables.ORDERS ,schema = Schemas.PUBLIC)
public class OrdersEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,
  generator = "orders_order_id_seq")
  @Column(name = "order_id")
  private Long orderId;
  @Column(name = "consumer_id")
  private Long consumerId;
  @Column(name = "status")
  private String status;
  @Column(name = "dt")
  private java.sql.Timestamp dt;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    OrdersEntity that = (OrdersEntity) o;
    return Objects.equals(orderId, that.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId);
  }
}
