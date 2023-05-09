package day2;

import java.util.List;

public class Product {
    /*
        Product Id (long)
        SKU (String)
        Name of product (String)
        Price of Product (double)
        Discounted Price (double)
        Images (List)
        Size Available - [M,L,XL,XXL] => String
        Number of stock Available - 2 (long)
        Product Detail - String
        Vendor Id (long)
        Rating (Rating)
     */

    private long productId;
    private String sku;
    private String productName;
    private double price;
    private double discountedPrice;
    private List images;
    private SizeAvailable sizeAvailable; // Dressing
    private long numberOfStock;
    private String productDetail;
    private long vendorId;
    private Rating rating;
    /*
        Behaviour
        -> Like
        -> Share
        -> Buy
        -> Add to cart
     */

    private Product() {}  // Default Constructor

    // Non dressing products (Parameterized Constructor)
    public Product(long productId, String sku, String productName, double price, double discountedPrice, long numberOfStock, String productDetail, long vendorId){
        this.productId = productId;
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.numberOfStock = numberOfStock;
        this.productDetail = productDetail;
        this.vendorId = vendorId;
    }

    // Dressing products (Parameterized Constructor)
    public Product(long productId, String sku, String productName, double price, double discountedPrice, SizeAvailable sizeAvailable, long numberOfStock, String productDetail, long vendorId){
        this.productId = productId;
        this.sku = sku;
        this.productName = productName;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.numberOfStock = numberOfStock;
        this.productDetail = productDetail;
        this.vendorId = vendorId;

        this.sizeAvailable = sizeAvailable;
    }


    public long getProductId() {
        return productId;
    }

    public String getSku() {
        return sku;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public List getImages() {
        return images;
    }

    public SizeAvailable getSizeAvailable() {
        return sizeAvailable;
    }

    public long getNumberOfStock() {
        return numberOfStock;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public long getVendorId() {
        return vendorId;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }


    // Behaviour

    public void decreaseStock(){
        this.numberOfStock = this.numberOfStock - 1;
    }

    public void restock(int numberOfStock){
        this.numberOfStock = this.numberOfStock + numberOfStock;
    }
}




