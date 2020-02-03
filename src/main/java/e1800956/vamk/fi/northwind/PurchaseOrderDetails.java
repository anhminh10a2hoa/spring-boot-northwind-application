package e1800956.vamk.fi.northwind;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.PurchaseOrderDetails")
@Table(name = "purchase_order_details")
public class PurchaseOrderDetails {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"purchase_order_id\"", nullable = false)
  private Integer purchaseOrderId;
  @Column(name = "\"product_id\"", nullable = true)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private java.math.BigDecimal quantity;
  @Column(name = "\"unit_cost\"", nullable = false)
  private java.math.BigDecimal unitCost;
  @Column(name = "\"date_received\"", nullable = true)
  private Timestamp dateReceived;
  @Column(name = "\"posted_to_inventory\"", nullable = false)
  private boolean postedToInventory;
  @Column(name = "\"inventory_id\"", nullable = true)
  private Integer inventoryId;
}