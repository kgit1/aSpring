package c1.sia.hibernate;

import java.io.Serializable;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;

@Entity
@Table(name="spitter")
//@XmlRootElement
public class Spitter implements Serializable {
  private static final long serialVersionUID = 1L;

  private Long id;

  //<start id="java_SpitterValidated" /> 
  @Size(min=3, max=20, message=
      "Username must be between 3 and 20 characters long.") //<co id="co_enforceSize"/> 
  @Pattern(regexp="^[a-zA-Z0-9]+$",
          message="Username must be alphanumeric with no spaces")  //<co id="co_noSpaces"/>
  private String username;  
  
  @Size(min=6, max=20,
          message="The password must be at least 6 characters long.") //<co id="co_enforceSize"/>
  private String password;

  @Size(min=3, max=50, message=
      "Your full name must be between 3 and 50 characters long.")    //<co id="co_enforceSize"/>   
  private String fullName;
  
  @Pattern(regexp="[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", 
          message="Invalid email address.") //<co id="co_emailPattern"/>
  private String email;  
  //<end id="java_SpitterValidated" /> 

  private boolean updateByEmail;
  
  @Id
  @GeneratedValue(strategy = AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name="username", unique=true)
  public String getUsername() {
    return this.username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Column(name="password")
  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  @Column(name="fullname")
  public String getFullName() {
    return fullName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name="email")
  public String getEmail() {
    return email;
  }

  public void setUpdateByEmail(boolean updateByEmail) {
    this.updateByEmail = updateByEmail;
  }

  @Column(name="update_by_email")
  public boolean isUpdateByEmail() {
    return updateByEmail;
  }

  @Transient
  @JsonIgnore
  public List<Spittle> getRecentSpittles() {
    Spittle spittle = new Spittle();
    spittle.setId(999L);
    spittle.setSpitter(this);
    spittle.setText("TEST SPITTLE #99");
    spittle.setWhen(new Date());
    return asList(spittle);
  }
  
  // plumbing
  @Override
  public boolean equals(Object obj) {
    return reflectionEquals(this, obj);
  }
  
  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
  
  @Override
  public String toString() {
    return reflectionToString(this);
  }

}

//import java.util.List;
//
//public class Spitter {
//  private Long id;
//  private String username;
//  private String password;
//  private String fullName;
//  private List<Spittle> spittles;
//  private String email;  
//  private boolean updateByEmail;
//
//  public Long getId() {
//    return id;
//  }
//
//  public void setId(Long id) {
//    this.id = id;
//  }
//
//  public String getUsername() {
//    return this.username;
//  }
//
//  public void setUsername(String username) {
//    this.username = username;
//  }
//
//  public String getPassword() {
//    return this.password;
//  }
//
//  public void setPassword(String password) {
//    this.password = password;
//  }
//
//  public void setFullName(String fullName) {
//    this.fullName = fullName;
//  }
//
//  public String getFullName() {
//    return fullName;
//  }
//  
//  public void setEmail(String email) {
//      this.email = email;
//  }
//  
//  public String getEmail() {
//      return email;
//  }
//  
//  public void setSpittles(List<Spittle> spittles) {
//    this.spittles = spittles;
//  }
//
//  public List<Spittle> getSpittles() {
//    return spittles;
//  }
//  
//  public void setUpdateByEmail(boolean updateByEmail) {
//      this.updateByEmail = updateByEmail;
//  }
//  
//  public boolean isUpdateByEmail() {
//    return updateByEmail;
//  }
//  
//  
//  @Override
//  public boolean equals(Object obj) {
//    Spitter other = (Spitter) obj;
//    return other.fullName.equals(fullName) && other.username.equals(username) && other.password.equals(password);
//  }
//  
//  @Override
//  public int hashCode() {
//    // TODO Auto-generated method stub
//    return super.hashCode();
//  }
//}
