/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author enano
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable{
    private static final long seialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(length = 150)
    private String nombre;
    @Column(length = 150)
    private String apellido;
    @Column(unique = true, length = 200)
    private String email;
    @Column(length = 255)
    private String password;
    private boolean activo;
    @Column(length = 100)
    private String fecha_creacion;
       
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "rol",
            joinColumns = @JoinColumn(name = "id"),
            inverseJoinColumns = @JoinColumn(name = "id")
    )
    private Set<Rol> roles = new HashSet<>();
    
    
}
