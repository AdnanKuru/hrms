package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "position")
@AllArgsConstructor
@NoArgsConstructor
public class Position {

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

    //@OneToMany(mappedBy = "Position")
    //private List<User> users;
}
