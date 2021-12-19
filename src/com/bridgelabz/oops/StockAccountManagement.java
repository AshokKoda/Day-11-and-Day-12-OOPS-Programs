package com.bridgelabz.oops;

import java.util.Scanner;

/*
 * Stock Account Management
 */
public class StockAccountManagement {

	//Main Method
	public static void main(String[] args) {

		StockData stockData = new StockData();
		stockData.addStock();
		stockData.totalStockDetails();
	}

}

class StockData extends Stock {
	double stockValue;
	
	public void stockPrice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter share price:");
		sharePrice = sc.nextDouble();
		System.out.println("Enter number of Shares:");
		numofShares = sc.nextInt();
	}
	
	public void addStock() {
		int i = 0;
		Stock st = new Stock();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the stock details");
		String stockName = sc.next();
		st.stockNames.add(stockName);
		System.out.println("Stocks Names: " + stockName);
		
	}

	//Calculate Total value
	public double stockCalculate() {
		this.stockValue = sharePrice * numofShares;
		return stockValue;
	}
	
	//Calculate total stock
	public void totalStockDetails() {
		int i = 0;
		double stockVal = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stocks number:");
		stockNum = sc.nextInt();
		
		while (i < stockNum) {
			System.out.println("Enter the stock name");
			String name = sc.nextLine();
			
			if (stockNames.contains(name)) {
				stockPrice();
				stockCalculate();
				System.out.println("Total value is: " + stockCalculate());
				stockVal += stockValue;
				i++;
			} 
		}
		
		System.out.println("Total Stock Value is : " + stockVal);
	}
}
