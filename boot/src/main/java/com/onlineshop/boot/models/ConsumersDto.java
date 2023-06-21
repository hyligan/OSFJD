package com.onlineshop.boot.models;

import lombok.Data;

@Data
public class ConsumersDto {
  private Boolean organization;
  private String organizationName;
  private String gender;
  private String firstName;
  private String middleInital;
  private String lastName;
}
