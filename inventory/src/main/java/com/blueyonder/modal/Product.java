package com.blueyonder.modal;

import lombok.Data;

@Data
public class Product {
	private int productId;
	private String productName;
	private float productPrice;
	private float quantityOnHand;
	private float productCost;

}
