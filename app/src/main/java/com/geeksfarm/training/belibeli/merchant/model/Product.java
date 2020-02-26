package com.geeksfarm.training.belibeli.merchant.model;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

public class Product {
    @SerializedName("productId")
    private long productId;

    @SerializedName("productName")
    private String productName;

    @SerializedName("productSlug")
    private String productSlug;

    @SerializedName("productQty")
    private int productQty;

    @SerializedName("productImage")
    private String productImage;

    @SerializedName("category")
    private Category category;

    @SerializedName("merchant")
    private Merchant merchant;

    @SerializedName("productPrice")
    private int productPrice;

    @SerializedName("productDesc")
    private String productDesc;

    public Product(long productId, String productName, String productSlug, int productQty, String productImage, Category category, Merchant merchant) {
        this.productId = productId;
        this.productName = productName;
        this.productSlug = productSlug;
        this.productQty = productQty;
        this.productImage = productImage;
        this.category = category;
        this.merchant = merchant;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductSlug() {
        return productSlug;
    }

    public int getProductQty() {
        return productQty;
    }

    public String getProductImage() {
        return productImage;
    }

    public Category getCategory() {
        return category;
    }

    public Merchant getMerchant() {
        return merchant;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public static Product fromJson(String json){
        Gson gson = new Gson();
        Product product = gson.fromJson(json,Product.class);
        return product;
    }
}
