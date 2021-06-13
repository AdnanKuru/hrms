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
@Table(name = "employers")
@Entity
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class Employer extends User {

    @Column(name = "companyName")
    @NotNull
    @NotBlank
    private String companyName;

    @Column(name = "website")
    @NotBlank
    @NotNull
    private String website;

    @Column(name = "phoneNumber")
    @NotNull
    @NotBlank
    private String phoneNumber;

}
