/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.Model;

/**
 *
 * @author facundocaldora
 */
@Entity
public class qshTicket extends Model {
    
    @Id
    private Long id;
    
    private Long malePrice;
    
    private Long femalePrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMalePrice() {
        return malePrice;
    }

    public void setMalePrice(Long malePrice) {
        this.malePrice = malePrice;
    }

    public Long getFemalePrice() {
        return femalePrice;
    }

    public void setFemalePrice(Long femalePrice) {
        this.femalePrice = femalePrice;
    }
    
    public static void create(qshTicket ticket){
        ticket.save();
    }
    
    public static void delete(qshTicket ticket){
        ticket.delete();
    }
    
    public static void update(qshTicket ticket){
        ticket.update();
    }
    
}
