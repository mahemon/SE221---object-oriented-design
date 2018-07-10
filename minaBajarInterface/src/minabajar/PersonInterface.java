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
public interface PersonInterface {
    public void add(int id,String name,String address);
    public void update(String name,String address);
    public void delete();
    public int get_id();
    public String get_name();
    public String get_address();
}
