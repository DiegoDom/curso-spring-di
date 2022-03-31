package com.curso.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.curso.springboot.di.app.models.domain.ItemFactura;
import com.curso.springboot.di.app.models.domain.Producto;
import com.curso.springboot.di.app.models.service.IServicio;
import com.curso.springboot.di.app.models.service.MiServicio;
import com.curso.springboot.di.app.models.service.MiServicioComplejo;

@Configuration
public class AppConfig {
	
	@Bean("miServicioSimple")
	@Primary
	public IServicio registrarMiServicio() {
		return new MiServicio();
	}
	
	@Bean("miServicioComplejo")
	public IServicio registrarMiServicioComplejo() {
		return new MiServicioComplejo();
	}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems() {
		
		Producto producto1 = new Producto("Audifonos Xiamo", 650);
		Producto producto2 = new Producto("Audifonos Sony", 1650);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		
		return Arrays.asList(linea1, linea2);
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina() {
		
		Producto producto1 = new Producto("Mouse Razer", 1550);
		Producto producto2 = new Producto("Pantalla DELL 25''", 5500);
		Producto producto3 = new Producto("Teclado Mecánico Razer", 3500);
		Producto producto4 = new Producto("Mouse cover Razer", 500);
		
		ItemFactura linea1 = new ItemFactura(producto1, 1);
		ItemFactura linea2 = new ItemFactura(producto2, 2);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 3);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
	
}
