package com.vietjack.app;

import java.util.Scanner;

import com.vietjack.service.AuthorService;
import com.vietjack.service.BookService;
import com.vietjack.service.CategoryService;
import com.vietjack.service.MenuService;

public class MainApp {
	private static MenuService menuService = new MenuService();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*authorService.top3AuthorByRevenue();
		System.out.println("-----------------------");
		categoryService.top3CategoryByRevenue();*/

		boolean flag = true;
		while (flag) {
			menuService.printMenuMenu();
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				menuService.authorMenus();
				break;
			case 2:
				menuService.categoryMenus();
				break;
			case 3:
				menuService.bookMenus();
				break;
			case 4:
				menuService.ordersMenus();
				break;
			case 5:
				menuService.bookStoreMenus();
				break;
			case 6:
				System.out.println("System end");
				flag = false;
				break;
			}

		}

	}
}
