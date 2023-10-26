package com.app.backspring.persistence.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipos")
public class Team {
    @Id
    @Column(nullable = false , name = "Nombre")
    @NotEmpty
    private String name;
    @Column(name = "Ciudad")
    private String city;
    @Column(name = "Conferencia")
    private String conference;
    @Column(name = "Division")
    private String division;

  //  @OneToMany(mappedBy = "idequipo")

}
