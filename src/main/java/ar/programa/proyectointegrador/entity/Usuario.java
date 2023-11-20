package ar.programa.proyectointegrador.model.entidad;

import ar.programa.proyectointegrador.enumerado.TipoUsuarioEmun;
import jakarta.persistence.*;


@lombok.Data
@lombok.RequiredArgsConstructor

@Entity
@Table (name="usuario")


public class Usuario {
    @Id
    @Column(name="id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="username")
    private String nombreUsuario;
    @Column(name="password")
    private String pass;
    @Enumerated(value = EnumType.STRING)
    private TipoUsuarioEmun tipoUsuarioEmun;
}
