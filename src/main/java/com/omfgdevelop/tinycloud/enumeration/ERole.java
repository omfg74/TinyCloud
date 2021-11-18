package com.omfgdevelop.tinycloud.enumeration;

public enum ERole {

  ROLE_USER("USER"),
  ROLE_ADMIN("ADMIN");

  private final String value;

  ERole(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }
}
