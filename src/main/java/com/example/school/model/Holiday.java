package com.example.school.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "holidays")
//@AllArgsConstructor // This generates a constructor with all fields as parameters
public class Holiday extends BaseEntity {
    @Id
    private String day;
    private String reason;

    @Enumerated(EnumType.STRING)
    private Type type;

    public enum Type{
        FESTIVAL, FEDERAL;
    }


}
