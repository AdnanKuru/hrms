package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "jobPosition")
@AllArgsConstructor
@NoArgsConstructor
public class JobPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobId")
    private int id;

    @Column(name = "jobName")
    private String jobName;

    @Column(name = "information")
    private String information;

    @Column(name = "cretedDate")
    private LocalDate createdDate;
}
