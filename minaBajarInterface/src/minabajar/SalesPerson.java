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
class SalesPerson implements SalesPeopleInterface {

    private int id;
    private String name;
    private double tax = 0.02;
    private Product product[] = new Product[10];
    private Customer customer[] = new Customer[10];
    private int quantity = 1;
    private double total = 0;
    int i =-1 ;

    @Override
    public void add(int id, String name,String address) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void sale(Product p, Customer c, int quantity) {
        i++;
        product[i] = p;
        customer[i] = c;
        
        this.quantity = quantity;
        double mainbill = product[i].get_product_price() * quantity;
        double taxOnBill = mainbill*tax;
        total = mainbill+taxOnBill;
    }

    public void sale(Product p, MemberCustomer c, int quantity) {
        i++;
         product[i] = p;
        customer[i] = c;
        this.quantity = quantity;
       double mainbill = product[i].get_product_price() * quantity;
        double taxOnBill = mainbill*tax;
        double discountOnbill = (mainbill+taxOnBill)* c.get_discount();
        total = mainbill+taxOnBill-discountOnbill ;
    }

    @Override
    public void invoice() {

        System.out.println("Invoice");
        System.out.printf("Customer Name: %s\n"
                + "Product Name:%s\n"
                + "Product Price:%f\n"
                + "Product Quantity: %d\n"
                + "Total Price: %f\n",
                customer[i].get_name(),
                product[i].get_product_name(),
                product[i].get_product_price(),
                quantity,
                total
        );
    }

    @Override
    public void update(String name, String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int get_id() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String get_name() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String get_address() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
