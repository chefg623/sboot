package com.chefg.sboot.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "user")
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})


@Data
@AllArgsConstructor
@NoArgsConstructor
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    int id;
    String username;
    String password;
}
