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
public interface SalesPeopleInterface extends PersonInterface {
   void sale(Product p, Customer c, int quantity);
   void invoice();
}
