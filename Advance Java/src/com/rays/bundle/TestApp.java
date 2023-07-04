package com.rays.bundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestApp {
	public static void main(String[] args) {
		testAppProperties();
		testApp_hiProperties();
		testAppNewLocale();
	}

	private static void testAppNewLocale() {

		System.out.print("Output of App_hi.Properties with New Locale :-> ");
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app",new Locale("hi"));
		System.out.print("Hindi String : " + rb.getString("greeting"));
		System.out.println();
	}

	private static void testApp_hiProperties() {
		System.out.print("Output of App_hi.Properties :-> ");
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app_hi");
		System.out.print("Hindi String : " + rb.getString("greeting"));
		System.out.println();
		System.out.println();
	}

	private static void testAppProperties() {
		System.err.print("Output of App.Properties :-> ");
		ResourceBundle rb = ResourceBundle.getBundle("com.rays.bundle.app");
		System.out.println("Driver : " + rb.getString("driver"));
		System.out.println("                             URL : " + rb.getString("url"));
		System.out.println("                             User : " + rb.getString("user"));
		System.out.println("                             Password : " + rb.getString("password"));
		System.out.println();
	}

}
