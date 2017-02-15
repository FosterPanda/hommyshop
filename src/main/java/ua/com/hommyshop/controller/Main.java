package ua.com.hommyshop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.hommyshop.entity.Brand;
import ua.com.hommyshop.entity.Clothing;
import ua.com.hommyshop.service.*;
import ua.com.hommyshop.serviceImp.*;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");

		BrandService brandService = (BrandService) context.getBean(BrandServiceImp.class);
		CategoryService categoryService = (CategoryService) context.getBean(CategoryServiceImp.class);
		ClothingService clothingService = (ClothingService) context.getBean(ClothingServiceImp.class);
		ColorService colorService = (ColorService) context.getBean(ColorServiceImp.class);
		SizeService Size = (SizeService) context.getBean(SizeServiceImp.class);
		SubcategoryService subcategoryService = (SubcategoryService) context.getBean(SubcategoryServiceImp.class);
		UserService userService = (UserService) context.getBean(UserServiceImp.class);
		

		Brand brand = brandService.findByName("Zara");

		Clothing clothing = clothingService.findByName("Convers");

		clothing.setBrand(brand);

		clothingService.update(clothing);

		context.close();

	}

}