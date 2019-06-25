package com.Review10;

public class Marketing {
	private String employeeName;
	private String productName;
	private double saleAmount;
	public Marketing(String employeeName, String productName, double saleAmount) {
	
		this.employeeName = employeeName;
		this.productName = productName;
		this.saleAmount = saleAmount;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getSaleAmount() {
		return saleAmount;
	}
	public void setSaleAmount(double saleAmount) {
		this.saleAmount = saleAmount;
	}
	@Override
	public String toString() {
		return "Marketing [employeeName=" + employeeName + ", productName=" + productName + ", saleAmount=" + saleAmount
				+ "]";
	}
	

}
