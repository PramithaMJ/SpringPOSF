package com.springbootacademy.springbatch10pos.dto;

import javax.persistence.Column;

//DTO-Data transfer Object
public class CustomerDTO {

    private int customerId;
    private String customerName;
    private String customerAddress;
    private double customerSalery;
    private String nic;
    private boolean activeStatus;

    public CustomerDTO() {
    }

    public CustomerDTO(int customerId, String customerName, String customerAddress, double customerSalery, String nic, boolean activeStatus) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerSalery = customerSalery;
        this.nic = nic;
        this.activeStatus = activeStatus;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCustomerSalery() {
        return customerSalery;
    }

    public void setCustomerSalery(double customerSalery) {
        this.customerSalery = customerSalery;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(boolean activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", customerSalery=" + customerSalery +
                ", nic='" + nic + '\'' +
                ", activeStatus=" + activeStatus +
                '}';
    }
}
