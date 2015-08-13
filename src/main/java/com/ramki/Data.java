/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ramki;

import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author ramki
 */
@ApplicationScoped

public class Data {
    private int totalCompleted;
    private int size;
    private String name;

    public Data() {
        totalCompleted=0;
        size=0;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    

    public int getTotalCompleted() {
        return totalCompleted;
    }

    public void setTotalCompleted(int totalCompleted) {
        this.totalCompleted = totalCompleted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Data{" + "totalCompleted=" + totalCompleted + ", size=" + size + ", name=" + name + '}';
    }

   
    
}
