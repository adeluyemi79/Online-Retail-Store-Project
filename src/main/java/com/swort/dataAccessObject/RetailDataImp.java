package com.swort.dataAccessObject;







import java.util.HashMap;



import java.util.Map;



import com.swort.RetailModule;



import com.swort.dataAccessObject.RetailAccessObject;











public class RetailDataImp implements RetailAccessObject {







	Map<Integer,RetailModule> users = new HashMap<>();



	



	



	@Override



	public void create(RetailModule product) {



		users.put(product.getProduct_id(),product);



	}







	@Override



	public RetailModule read(int product_id) {



		return users.get(product_id);



	}



	







}
