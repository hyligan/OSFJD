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
@Table(name = Tables.ADDRESS ,schema = Schemas.PUBLIC)
public class AddressEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,
  generator = "address_address_id_seq")
  @Column(name = "address_id")
  private Long addressId;
  @Column(name = "city")
  private String city;
  @Column(name = "street")
  private String street;
  @Column(name = "house")
  private String house;
  @Column(name = "apartment")
  private String apartment;
  @Column(name = "country")
  private String country;
  @Column(name = "consumer_id")
  private Long consumerId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AddressEntity that = (AddressEntity) o;
    return Objects.equals(addressId, that.addressId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressId);
  }
}
