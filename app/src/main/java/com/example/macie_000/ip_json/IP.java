package com.example.macie_000.ip_json;

/**
 * Created by macie_000 on 2015-05-31.
 */
public class IP {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public IP(){}
    public IP(String sAddress){
        this.address = sAddress;
    }
}
