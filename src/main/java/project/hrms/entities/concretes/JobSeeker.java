package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "jobSeekers")
@Entity
@PrimaryKeyJoinColumn(name = "id",referencedColumnName = "id")
public class JobSeeker extends User{


    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "nationalId")
    private String nationalId;

    @Column(name = "dateOfBirth")
    private LocalDate dateOfBirth;

}
