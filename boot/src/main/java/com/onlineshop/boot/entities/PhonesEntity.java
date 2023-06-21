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
@Table(name = Tables.PHONES ,schema = Schemas.PUBLIC)
public class PhonesEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "phones_phone_id_seq")
  @Column(name = "phone_id")
  private Long phoneId;
  @Column(name = "work")
  private String work;
  @Column(name = "home")
  private String home;
  @Column(name = "reserve")
  private String reserve;
  @Column(name = "consumer_id")
  private Long consumerId;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PhonesEntity that = (PhonesEntity) o;
    return Objects.equals(phoneId, that.phoneId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(phoneId);
  }
}
