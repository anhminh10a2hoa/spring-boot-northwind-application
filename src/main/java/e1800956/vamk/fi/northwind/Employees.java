package e1800956.vamk.fi.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.Employees")
@Table(name = "employees")
public class Employees {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"company\"", nullable = true)
  private String company;
  @Column(name = "\"last_name\"", nullable = true)
  private String lastName;
  @Column(name = "\"first_name\"", nullable = true)
  private String firstName;
  @Column(name = "\"email_address\"", nullable = true)
  private String emailAddress;
  @Column(name = "\"job_title\"", nullable = true)
  private String jobTitle;
  @Column(name = "\"business_phone\"", nullable = true)
  private String businessPhone;
  @Column(name = "\"home_phone\"", nullable = true)
  private String homePhone;
  @Column(name = "\"mobile_phone\"", nullable = true)
  private String mobilePhone;
  @Column(name = "\"fax_number\"", nullable = true)
  private String faxNumber;
  @Column(name = "\"address\"", nullable = true)
  private String address;
  @Column(name = "\"city\"", nullable = true)
  private String city;
  @Column(name = "\"state_province\"", nullable = true)
  private String stateProvince;
  @Column(name = "\"zip_postal_code\"", nullable = true)
  private String zipPostalCode;
  @Column(name = "\"country_region\"", nullable = true)
  private String countryRegion;
  @Column(name = "\"web_page\"", nullable = true)
  private String webPage;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"attachments\"", nullable = true)
  private String attachments;
}