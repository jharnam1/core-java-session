package day5;

public class Customer extends Person{

 public String getShippingAddress() {
  return shippingAddress;
 }

 public void setShippingAddress(String shippingAddress) {
  this.shippingAddress = shippingAddress;
 }

 private String shippingAddress;

}
