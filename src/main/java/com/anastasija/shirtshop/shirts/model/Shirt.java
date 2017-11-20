package com.anastasija.shirtshop.shirts.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shirts")
public class Shirt extends BaseEntity {

    @Column(name = "type")
    public Integer type;

    @Column(name = "size")
    public Integer size;

    @Column(name = "color")
    public String color;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}