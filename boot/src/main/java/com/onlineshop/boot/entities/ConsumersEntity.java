package com.onlineshop.boot.entities;

import com.onlineshop.boot.utils.Schemas;
import com.onlineshop.boot.utils.constants.Tables;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = Tables.CONSUMERS ,schema = Schemas.PUBLIC)
public class ConsumersEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,generator = "consumers_consumer_id_seq")
  @Column(name = "consumer_id")
  private Long consumerId;
  @Column(name = "organization")
  private Boolean organization;
  @Column(name = "organization_name")
  private String organizationName;
  @Column(name = "gender")
  private String gender;
  @Column(name = "first_name")
  private String firstName;
  @Column(name = "middle_inital")
  private String middleInital;
  @Column(name = "last_name")
  private String lastName;
  @OneToMany(mappedBy = "consumerId")
  private List<AddressEntity> address;
  @OneToMany(mappedBy = "consumerId")
  private List<EmailsEntity> emails;
  @OneToMany(mappedBy = "consumerId")
  private List<PhonesEntity> phones;
  @OneToMany(mappedBy = "consumerId")
  private List<OrdersEntity> orders;
  @OneToMany(mappedBy = "consumerId")
  private List<AuthEntity> auth;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ConsumersEntity that = (ConsumersEntity) o;
    return Objects.equals(consumerId, that.consumerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerId);
  }
}
