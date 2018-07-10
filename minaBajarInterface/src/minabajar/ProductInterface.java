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
public interface ProductInterface {
    void add_product(int id,String name,double price, boolean availability);
    int get_product_id();
    String get_product_name();
    double get_product_price();
    boolean check_avaibality();
    void change_avaibality(boolean availability);
    
}
