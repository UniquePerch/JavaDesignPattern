package org.example.builder.entity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
public class Actor {
    private String type;
    private String sex;
    private String face;
    private String costume;
    private String hairstyle;
}
