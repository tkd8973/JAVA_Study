package org.CRUD;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name = "post")
// Table : 'id' 'WRITER' 'WRITING'
public class Board {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int Id;

    @Column(name = "WRITER", nullable = false, length = 10)
    private String WRITER;

    @Column(name = "WRITING", nullable = false, length = 100)
    private String WRITING;

    public Board() {}
    public Board(String WRITER, String WRITING){
        this.WRITER = WRITER;
        this.WRITING = WRITING;
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

}