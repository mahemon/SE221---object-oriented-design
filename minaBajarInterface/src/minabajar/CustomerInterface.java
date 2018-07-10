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
public interface CustomerInterface {
    public void add_customer(int id,String name,String address);
    public void update_customer(String name,String address);
    public void delete_customer();
    public int get_customer_id();
    public String get_customer_name();
    public String get_customer_address();
    
}
