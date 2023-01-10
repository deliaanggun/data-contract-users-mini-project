package idistbootcamptima.miniproject.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor //lombok
@AllArgsConstructor //lombok
@Table(schema = "public", name="transaction") //create table in database
public class Transaction {

    @Id
    private Long id; //perlu nanya bisa diganti nik gak?

    @Column(name = "Pengirim")
    private String sender;

    @Column(name = "Penerima")
    private String recepient;

    @Column(name = "Nominal")
    private String amount;

    @Column(name = "Catatan")
    private String describtion;

    @Column(name = "Waktu")
    private LocalDate transactionDate;

    @Column(name = "Status")
    private String status;

    @Column(name = "ID_referensi")
    private String referenceID;


}
