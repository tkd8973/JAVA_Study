package org.CRUD;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "post")
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;

    @Column(name = "dt", nullable = false)
    private Timestamp dt;

    @Column(name = "WRITER", nullable = false, length = 10)
    private String WRITER;

    @Column(name = "WRITING", nullable = false, length = 100)
    private String WRITING;


    public Board() {}
    public Board(String WRITER, String WRITING, Timestamp  dt){
        this.WRITER = WRITER;
        this.WRITING = WRITING;
        this.dt = dt;
    }
    public int getID() {
        return Id;
    }
    public void setID(int Id) {
        this.Id = Id;
    }
    public String getWRITER() {
        return WRITER;
    }
    public void setWRITER(String WRITER) {
        this.WRITER = WRITER;
    }
    public String getWRITING() {
        return WRITING;
    }
    public void setWRITING(String WRITING) {
        this.WRITING = WRITING;
    }
    public Timestamp getDt() {
        return dt;
    }
    public void setDt(Timestamp dt) {
        this.dt = dt;
    }
}
