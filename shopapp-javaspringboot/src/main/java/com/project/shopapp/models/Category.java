package com.project.shopapp.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Data //toString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") // Thừa vì tên cột trong Db và tên thuộc tính trong java là giống nhau
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

}
