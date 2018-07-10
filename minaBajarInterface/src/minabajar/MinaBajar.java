/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minabajar;

/**
 *
 * @author Administrator
 * customer
 *      name,id,address,
 *      buy(pid)
 *      add_customer()
 *      
 * salesperson
 *      name,id,
 * product
 *      id,name,price,availability
 * 
 */
public class MinaBajar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Customer cust = new Customer();
     cust.add(10, "Golam Rabbani", "Dhanmondi");
     MemberCustomer mc = new MemberCustomer();
     mc.add(23, "Robin", "Bonosri");
     Product pr = new Product();
     pr.add_product(123, "Apple", 15.00, true);
     SalesPerson sp = new SalesPerson();
     sp.add(2, "Dipto Paul","Sankar");
     
     sp.sale(pr, cust, 2);
     sp.invoice();
     sp.sale(pr, mc, 2);
     sp.invoice();
    }
    
}
