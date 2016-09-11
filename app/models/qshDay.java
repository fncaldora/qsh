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
public class qshDay extends Model{
    
    @Id
    private Long id;
    
    private String name;
    
    public enum Days{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        try{
            this.name = Days.valueOf(name).toString();
        }catch(Exception e){
            this.name = null;
        }
    }
    
    public static void create(qshDay day){
        day.save();
    }
    
    public static void update(qshDay day){
        day.update();
    }
    
    public static void delete(qshDay day){
        day.delete();
    }
    
    
    
}
