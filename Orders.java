
package com.mycompany.guicoursework;
public class Orders {

    private static int id =0;
    private String idNumber;
    private String phoneNumber;
    private int qty;
    private String status;
    private double amount;
    private String size;
    private String[] TsizeArr = {"XS", "S", "M", "L", "XL", "XXL"};
    private final String[] OrderStatusArr = {"Processing", "Delivering", "Delivered"};

   
    public Orders(String idNumber) {
        this.idNumber=idNumber;
    }

    public Orders(String idNumber, String phoneNumber, String size,int qty,   double amount,String status) {
        this.idNumber = idNumber;
        this.phoneNumber = phoneNumber;
        this.qty = qty;
        this.status = status;
        this.amount = amount;
        this.size = size;

    }

    public static int getId() {
        return id;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getQty() {
        return qty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public String getSize() {
        return size;
    }
    //----------------therunna------------------
    @Override
    public boolean equals(Object obj) {
        Orders c1=(Orders) obj;
        return c1.idNumber.equalsIgnoreCase(this.idNumber);
    }

}
