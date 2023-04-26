package day2;

import java.util.List;

public class Product {
    /*

        Product Id
        SKU
        Name of product
        Price of Product
        Discounted Price
        Images
        Size Available - [M,L,XL,XXL]
        Number of stock Available - 2
        Product Detail
        Vendor Id
        Rating
     */

    long productId;
    String sku;
    String productName;
    double price;
    double discountedPrice;
    List images;
    SizeAvailable sizeAvailable;
    long numberOfStock;
    String productDetail;
    long vendorId;
    Rating rating;
    /*
        Behaviour
        -> Like
        -> Share
        -> Buy
        -> Add to cart
     */


}
