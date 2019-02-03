package hu.nitrowise.nkm.akr.jpa.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADUser", schema = "com")
@Data
public class AdUser {

  @Id
  @Column(name = "AdUserId")
  private long id;
  @Column
  private String samAccountNameWithDomainName;
  @Column
  private String userPrincipalName;
  @Column
  private String email;
  @Column
  private String fullName;

}
