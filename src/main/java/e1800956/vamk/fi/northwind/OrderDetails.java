package e1800956.vamk.fi.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.OrderDetails")
@Table(name = "order_details")
public class OrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"order_id\"", nullable = false)
  private Integer orderId;
  @Column(name = "\"product_id\"", nullable = true)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private java.math.BigDecimal quantity;
  @Column(name = "\"unit_price\"", nullable = true)
  private java.math.BigDecimal unitPrice;
  @Column(name = "\"discount\"", nullable = false)
  private Double discount;
  @Column(name = "\"status_id\"", nullable = true)
  private Integer statusId;
  @Column(name = "\"date_allocated\"", nullable = true)
  private Timestamp dateAllocated;
  @Column(name = "\"purchase_order_id\"", nullable = true)
  private Integer purchaseOrderId;
  @Column(name = "\"inventory_id\"", nullable = true)
  private Integer inventoryId;
}