package com.geeksfarm.training.belibeli.merchant.model;


import com.google.gson.annotations.SerializedName;

public class Merchant {

    @SerializedName("merchantId")
    private long merchantId;

    @SerializedName("merchantName")
    private  String merchantName;

    @SerializedName("merchantSlug")
    private String merchantSlug;

    public Merchant(long merchantId, String merchantName, String merchantSlug) {
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.merchantSlug = merchantSlug;
    }

    public long getMerchantId() {
        return merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public String getMerchantSlug() {
        return merchantSlug;
    }
}
