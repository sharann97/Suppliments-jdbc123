package com.suppliments.util;

public class DBQueries {
	public static final String INSERTQUERY=
			"INSERT INTO SUPPLIMENTS(brand_name,prod_id,type,price) values(?,?,?,?)";
		public static final String UPDATEQUERY="UPDATE SUPPLIMENTS SET amount=? where prod_id=?";
		public static final String DELETEQUERY="DELETE FROM INVESTMENT WHERE product_id=?";
		
		public static final String SELECTQUERY="SELECT * FROM SUPPLIMENTS";
		public static final String SELECTBYTYPE="SELECT * FROM SUPPLIMENTS WHERE TYPE=?";
		public static final String SELECTBYPRODUCTID="SELECT * FROM SUPPLIMENTS WHERE PRODUCTID=?";
		public static final String SELECTBYPRICE="SELECT * FROM INVESTMENT WHERE PRICE=? AND PRODID<?";
		public static final String SELECTBYBRANDNAME="SELECT * FROM SUPPLIMENTS WHERE BRANDNAME=?";
	
}