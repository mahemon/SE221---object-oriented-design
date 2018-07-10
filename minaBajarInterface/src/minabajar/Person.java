/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minabajar;

/**
 *
 * @author Administrator
 */
public class Person implements PersonInterface{
    private int id;
    private String name,
                   address;

    @Override
    public void add(int id, String name, String address) {
    this.id = id;
    this.name= name;
    this.address = address;
    }

    @Override
    public void update(String name, String address) {
         this.name= name;
    this.address = address;
        }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get_id() {
        return id;
    }

    @Override
    public String get_name() {
        return name;
    }

    @Override
    public String get_address() {
        return address;
    }
}
