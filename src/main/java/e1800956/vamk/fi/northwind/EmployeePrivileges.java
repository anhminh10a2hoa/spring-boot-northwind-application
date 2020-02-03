package e1800956.vamk.fi.northwind;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "e1800956.vamk.fi.northwind.EmployeePrivileges")
@Table(name = "employee_privileges")
@IdClass(EmployeePrivileges.PrimaryKeys.class)
public class EmployeePrivileges {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer employeeId;
    private Integer privilegeId;
  }

  @Id
  @Column(name = "\"employee_id\"", nullable = false)
  private Integer employeeId;
  @Id
  @Column(name = "\"privilege_id\"", nullable = false)
  private Integer privilegeId;
}