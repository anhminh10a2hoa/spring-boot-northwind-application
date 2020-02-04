package e1800956.vamk.fi.northwind.InventoryTransaction;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.InventoryTransactions")
@Table(name = "inventory_transactions")
public class InventoryTransactions {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"transaction_type\"", nullable = false)
  private Byte transactionType;
  @Column(name = "\"transaction_created_date\"", nullable = true)
  private Timestamp transactionCreatedDate;
  @Column(name = "\"transaction_modified_date\"", nullable = true)
  private Timestamp transactionModifiedDate;
  @Column(name = "\"product_id\"", nullable = false)
  private Integer productId;
  @Column(name = "\"quantity\"", nullable = false)
  private Integer quantity;
  @Column(name = "\"purchase_order_id\"", nullable = true)
  private Integer purchaseOrderId;
  @Column(name = "\"customer_order_id\"", nullable = true)
  private Integer customerOrderId;
  @Column(name = "\"comments\"", nullable = true)
  private String comments;
}