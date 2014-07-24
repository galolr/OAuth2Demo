package demo.entity.model;

import javax.persistence.*;

/**
 * Created by gersomlopez on 7/7/14.
 */
@Entity
public class Password {
    private int id;
    private String password;
    private Employee employeeById;

    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 10)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Password password1 = (Password) o;

        if (id != password1.id) return false;
        if (password != null ? !password.equals(password1.password) : password1.password != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    @OneToOne
    @JoinColumn(name = "id", referencedColumnName = "id", nullable = false)
    public Employee getEmployeeById() {
        return employeeById;
    }

    public void setEmployeeById(Employee employeeById) {
        this.employeeById = employeeById;
    }
}
