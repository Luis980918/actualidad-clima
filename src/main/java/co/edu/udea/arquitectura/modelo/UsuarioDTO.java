package co.edu.udea.arquitectura.modelo;

import co.edu.udea.arquitectura.util.enums.TipoUsuario;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class UsuarioDTO {

    private Long id;
    @NotNull
    private String nombre;
    @NotNull
    private String apellido;
    @NotNull
    private String correo;
    @NotNull
    private String contrasena;
    private LocalDate fechaNacimiento;
    private String celular;
    private CiudadDTO ciudadUsuario;
    /*@NotNull
    private TipoUsuario tipo;*/

}
