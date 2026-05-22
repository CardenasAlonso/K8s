package pe.edu.vallegrande.hancelcardenasrest.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("personas")
public class Persona {

    @Id
    private Long id;
    private String name;
    private String apellido;
    private String email;
}
