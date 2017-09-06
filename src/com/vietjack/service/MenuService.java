package com.vietjack.service;

import java.util.Scanner;

public class MenuService {
	private static AuthorService authorService=new AuthorService();
	private static CategoryService categoryService=new CategoryService();
	private static BookService bookService=new BookService();
	private static CustomerService customerService = new CustomerService();
	private static OrderService orderService = new OrderService();
	private static OrderDetailService orderDetailService = new OrderDetailService();
	private static BookStoreService bookStoreService = new BookStoreService();
	private static Scanner scanner = new Scanner(System.in);

	public static void categoryMenus(){
		categoryService.printCategoryMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome category menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				categoryService.addNewRealCategory();
				break;
			case 2:
				categoryService.findCategoryByName();
				break;
			case 3:
				categoryService.displayCategory();
				break;
			case 4:
				categoryService.updateCategory();
				break;
			case 5:
				categoryService.deleteCategoryByName();
				break;
			case 6:
				System.out.println("Return main menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void bookMenus(){
		bookService.printBookMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome bookService menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				bookService.addNewRealBook();
				break;
			case 2:
				bookService.findBookByName();
				break;
			case 3:
				bookService.displayBook();
				break;
			case 4:
				bookService.updateBook();
				break;
			case 5:
				bookService.deleteBookByName();
				break;
			case 6:
				System.out.println("Return main menu");
				flag = false;
				break;
			}

		}
	}
	public static void authorMenus(){
		authorService.printAuthorMenu();

		boolean flag = true;
		while (flag) {
			System.out.println("Welcome author menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				authorService.addNewRealAuthor();
				break;
			case 2:
				authorService.findAuthorByName();
				break;
			case 3:
				authorService.displayAuthor();
				break;
			case 4:
				authorService.updateAuthor();
				break;
			case 5:
				authorService.deleteAuthorByName();
				break;
			case 6:
				System.out.println("Return main menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void customerMenus(){
		customerService.printCustomerMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome customer menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				customerService.addNewRealCustomer();
				break;
			case 2:
				customerService.findCustomerByName();
				break;
			case 3:
				customerService.displayCustomer();
				break;
			case 4:
				customerService.updateCustomer();
				break;
			case 5:
				customerService.deleteCustomerByName();
				break;
			case 6:
				System.out.println("Return orders menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void orderMenus(){
		orderService.printOrderMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome order menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				orderService.addNewRealOrder();
				break;
			case 2:
				orderService.findOrderById();
				break;
			case 3:
				orderService.displayOrder();
				break;
			case 4:
				orderService.updateOrder();
				break;
			case 5:
				orderService.deleteOrderById();
				break;
			case 6:
				System.out.println("Return orders menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void orderDetailMenus(){
		orderDetailService.printOrderDetailMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome order detail menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				orderDetailService.addNewRealOrderDetail();
				break;
			case 2:
				orderDetailService.findOrderDetailById();
				break;
			case 3:
				orderDetailService.displayOrderDetail();
				break;
			case 4:
				orderDetailService.updateOrderDetail();
				break;
			case 5:
				orderDetailService.deleteOrderDetailById();
				break;
			case 6:
				System.out.println("Return orders menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void ordersMenus() {
		System.out.println("1. To Manage customers");
		System.out.println("2. To Manage order");
		System.out.println("3. To Manage order detail");
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome orders menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				customerMenus();
				break;
			case 2:
				orderMenus();
				break;
			case 3:
				orderDetailMenus();
				break;
			case 4:
				System.out.println("Return main menu");
				flag = false;
				break;
			}

		}
	}
	
	public static void bookStoreMenus() {
		bookStoreService.printBookStoreMenu();
		boolean flag = true;
		while (flag) {
			System.out.println("Welcome book store menu");
			System.out.println("Enter your choice");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				bookStoreService.topAuthorByRevenue();
				break;
			case 2:
				bookStoreService.topCategoryByRevenue();
				break;
			case 3:
				bookStoreService.dayRevenue();
				break;
			case 4:
				bookStoreService.timeRevenue();
				break;
			case 5:
				System.out.println("Return main menu");
				flag = false;
				break;
			}

		}
	}
	
	public void printMenuMenu(){
		System.out.println("The bookstore management program");
		System.out.println("1.To Manage authors");
		System.out.println("2.To Manage categorys");
		System.out.println("3.To Manage books");
		System.out.println("4.To Manage orders");
		System.out.println("5.To Manage sales");
		System.out.println("6.System end");
	}
}
