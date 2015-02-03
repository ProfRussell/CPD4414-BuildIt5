/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414buildit5;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author c0587637
 */
@ManagedBean
@ApplicationScoped
public class HelloWorldBean implements Serializable{
    private String name = "World";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String sayHello() {
        return "Hello " + name + "!";
    }
}
