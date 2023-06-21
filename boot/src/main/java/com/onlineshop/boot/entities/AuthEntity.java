package com.onlineshop.boot.entities;

import com.onlineshop.boot.utils.Schemas;
import com.onlineshop.boot.utils.constants.Tables;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = Tables.AUTH ,schema = Schemas.PUBLIC)
public class AuthEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO,
  generator = "auth_auth_id_seq")
  @Column(name = "auth_id")
  private Long authId;
  @Column(name = "login", unique = true)
  private String login;
  @Column(name = "pwd")
  private String pwd;
  @Column(name = "init_dt")
  private java.sql.Timestamp initDt;
  @Column(name = "upd_dt")
  private java.sql.Timestamp updDt;
  @Column(name = "consumer_id")
  private Long consumerId;


}
