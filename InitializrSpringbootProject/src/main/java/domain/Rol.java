/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import jakarta.persistence.*;
import java.io.Serializable;
/**
 *
 * @author enano
 */

@Entity
@Table(name = "rol")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_rol")
    private Integer idRol;
    @Column(name = "rol", unique = true, length = 25)
    private String rol;
    @Column(name = "descripcion", unique = true, length = 255)
    private String descripcion;
    
}
