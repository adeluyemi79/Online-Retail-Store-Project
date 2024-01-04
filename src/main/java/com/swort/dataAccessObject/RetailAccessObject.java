package com.swort.dataAccessObject;



import com.swort.RetailModule;



public interface RetailAccessObject {

	void create(RetailModule product);

	RetailModule read(int product_id);



}


