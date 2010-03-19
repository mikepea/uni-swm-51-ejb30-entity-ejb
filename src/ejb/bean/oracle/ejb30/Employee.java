package oracle.ejb30;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMP")
public class Employee implements java.io.Serializable {
    private int empNo;

    private String eName;

    private double sal;

    @Id
    @Column(name = "EMPNO")
    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return eName;
    }

    public void setEname(String eName) {
        this.eName = eName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("Class:").append(this.getClass().getName()).append(" :: ")
                .append(" empNo:").append(getEmpNo()).append(" ename:").append(
                        getEname()).append(" sal:").append(getSal());
        return buf.toString();
    }

}
