package com.ifox.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Car_Upload")
public class CarUpload {

    @Id
    @Column(name = "P_id", nullable = false)
    private long pId;

    @Column(name = "Plate", nullable = false)
    private String plate;

    @Column(name = "status")
    private int status;

    public CarUpload() {
    }

    public CarUpload(long p_id, String plate, int status) {
        this.pId = p_id;
        this.plate = plate;
        this.status = status;
    }

    public long getpId() {
        return pId;
    }

    public void setpId(long pId) {
        this.pId = pId;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
