package com.geeksfarm.training.belibeli.merchant.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ProductErrorResponse {
    @SerializedName("productName")
    List<String> productNameError = new ArrayList<>();

    @SerializedName("productQty")
    List<String> productQtyError = new ArrayList<>();

    @SerializedName("productPrice")
    List<String> productPriceError = new ArrayList<>();

    @SerializedName("merchantId")
    List<String> productMerchantError = new ArrayList<>();

    @SerializedName("categoryId")
    List<String> productCategoryError = new ArrayList<>();

    public List<String> getProductNameError() {
        return productNameError;
    }

    public List<String> getProductQtyError() {
        return productQtyError;
    }

    public List<String> getProductPriceError() {
        return productPriceError;
    }

    public List<String> getProductMerchantError() {
        return productMerchantError;
    }

    public List<String> getProductCategoryError() {
        return productCategoryError;
    }
}
