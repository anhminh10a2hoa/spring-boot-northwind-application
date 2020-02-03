package e1800956.vamk.fi.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.PurchaseOrders")
@Table(name = "purchase_orders")
public class PurchaseOrders {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"supplier_id\"", nullable = true)
  private Integer supplierId;
  @Column(name = "\"created_by\"", nullable = true)
  private Integer createdBy;
  @Column(name = "\"submitted_date\"", nullable = true)
  private Timestamp submittedDate;
  @Column(name = "\"creation_date\"", nullable = true)
  private Timestamp creationDate;
  @Column(name = "\"status_id\"", nullable = true)
  private Integer statusId;
  @Column(name = "\"expected_date\"", nullable = true)
  private Timestamp expectedDate;
  @Column(name = "\"shipping_fee\"", nullable = false)
  private java.math.BigDecimal shippingFee;
  @Column(name = "\"taxes\"", nullable = false)
  private java.math.BigDecimal taxes;
  @Column(name = "\"payment_date\"", nullable = true)
  private Timestamp paymentDate;
  @Column(name = "\"payment_amount\"", nullable = true)
  private java.math.BigDecimal paymentAmount;
  @Column(name = "\"payment_method\"", nullable = true)
  private String paymentMethod;
  @Column(name = "\"notes\"", nullable = true)
  private String notes;
  @Column(name = "\"approved_by\"", nullable = true)
  private Integer approvedBy;
  @Column(name = "\"approved_date\"", nullable = true)
  private Timestamp approvedDate;
  @Column(name = "\"submitted_by\"", nullable = true)
  private Integer submittedBy;
}