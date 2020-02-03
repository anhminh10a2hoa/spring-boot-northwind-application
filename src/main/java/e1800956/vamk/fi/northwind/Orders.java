package e1800956.vamk.fi.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.Orders")
@Table(name = "orders")
public class Orders {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"employee_id\"", nullable = true)
  private Integer employeeId;
  @Column(name = "\"customer_id\"", nullable = true)
  private Integer customerId;
  @Column(name = "\"order_date\"", nullable = true)
  private Timestamp orderDate;
  @Column(name = "\"shipped_date\"", nullable = true)
  private Timestamp shippedDate;
  @Column(name = "\"shipper_id\"", nullable = true)
  private Integer shipperId;
  @Column(name = "\"ship_name\"", nullable = true)
  private String shipName;
  @Column(name = "\"ship_address\"", nullable = true)
  private String shipAddress;
  @Column(name = "\"ship_city\"", nullable = true)
  private String shipCity;
  @Column(name = "\"ship_state_province\"", nullable = true)
  private String shipStateProvince;
  @Column(name = "\"ship_zip_postal_code\"", nullable = true)
  private String shipZipPostalCode;
  @Column(name = "\"ship_country_region\"", nullable = true)
  private String shipCountryRegion;
  @Column(name = "\"shipping_fee\"", nullable = true)
  private java.math.BigDecimal shippingFee;
  @Column(name = "\"taxes\"", nullable = true)
  private java.math.BigDecimal taxes;
  @Column(name = "\"payment_type\"", nullable = true)
  private String paymentType;
  @Column(name = "\"paid_date\"", nullable = true)
  private Timestamp paidDate;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"tax_rate\"", nullable = true)
  private Double taxRate;
  @Column(name = "\"tax_status_id\"", nullable = true)
  private Byte taxStatusId;
  @Column(name = "\"status_id\"", nullable = true)
  private Byte statusId;
}