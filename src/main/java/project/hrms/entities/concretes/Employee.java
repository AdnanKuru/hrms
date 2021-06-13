package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Employee extends User{

    @Column(name = "employeeName")
    @NotBlank
    @NotNull
    private String employeeName;

    @Column(name = "empoyeeSurname")
    @NotNull
    @NotBlank
    private String employeeSurname;
}
