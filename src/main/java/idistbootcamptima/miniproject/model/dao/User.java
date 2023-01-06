package idistbootcamptima.miniproject.model.dao;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.*;

/**
 * @author Get Arrays (https://www.getarrays.io/)
 * @version 1.0
 * @since 7/10/2021
 */
@Entity
@Data
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Table(schema = "public", name="users") //create table in database
public class User {
    @Id
//    @GeneratedValue(strategy = IDENTITY) //id to be generated
    private Long id; //perlu nanya bisa diganti nik gak?

    @Column(name = "No_Rekening")
    private String accountNumber;

    @Column(name = "Bank")
    private String bank;

    @Column(name = "NIK")
    private String nik;

    @Column(name = "Nama")
    private String name;

    @Column(name = "Nomor_Telp")
    private String phone;

    @Column(name = "Tanggal_Lahir")
//    @JsonFormat(pattern = "dd-mm-yyyy")
    private LocalDate birth;

    @Column(name = "Email")
    private String email;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;

    @Column(name = "MPIN")
    private String mpin;

    @Column(name = "Saldo")
    private String balance;
}
