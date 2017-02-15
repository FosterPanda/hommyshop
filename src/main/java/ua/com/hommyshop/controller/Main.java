package ua.com.hommyshop.controller;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.com.hommyshop.entity.Brand;
import ua.com.hommyshop.entity.Clothing;
import ua.com.hommyshop.service.BrandService;
import ua.com.hommyshop.service.ClothingService;
import ua.com.hommyshop.serviceImp.BrandServiceImp;
import ua.com.hommyshop.serviceImp.ClothingServiceImp;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("/META-INF/appContext.xml");

		BrandService brandService = (BrandService) context.getBean(BrandServiceImp.class);

		Brand brand = brandService.findByName("Zara");

		ClothingService clothingService = (ClothingService) context.getBean(ClothingServiceImp.class);

		Clothing clothing = clothingService.findByName("boots");

		clothing.setBrand(brand);

		clothingService.update(clothing);

		System.out.println(brand.getClothes());

		context.close();

	}

}