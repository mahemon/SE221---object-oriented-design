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
class Product implements ProductInterface{
    
  private  int id;
  private  String name;
  private  double price;
  private  boolean availability;
    @Override
    public void add_product(int id, String name, double price, boolean availability) {
       this.id = id;
       this.name = name;
       this.price = price;
       this.availability = availability;  
    }
    @Override
    public void change_avaibality(boolean availability) {
        this.availability = availability;
    }
    
    @Override
    public boolean check_avaibality() {
        return availability;
    }

    @Override
    public String get_product_name() {
       return name;
    }

    @Override
    public double get_product_price() {
        return price;
    }

    @Override
    public int get_product_id() {
        return id;
    }
    
}
