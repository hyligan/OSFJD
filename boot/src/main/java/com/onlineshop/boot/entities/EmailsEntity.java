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
@Table(name = Tables.EMAILS ,schema = Schemas.PUBLIC)
public class EmailsEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,
  generator = "emails_email_id_seq")
  @Column(name = "email_id")
  private Long emailId;
  @Column(name = "active")
  private Boolean active;
  @Column(name = "type")
  private String type;
  @Column(name = "consumer_id")
  private Long consumerId;
  @Column(name = "email", unique = true)
  private String email;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EmailsEntity that = (EmailsEntity) o;
    return Objects.equals(emailId, that.emailId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId);
  }
}
