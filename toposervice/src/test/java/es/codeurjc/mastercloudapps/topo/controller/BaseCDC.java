package es.codeurjc.mastercloudapps.topo.controller;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import es.codeurjc.mastercloudapps.topo.model.City;
import es.codeurjc.mastercloudapps.topo.service.TopoService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest
public abstract class BaseCDC {

	@MockBean
	TopoService topoService;
	
	@Autowired
	TopoController topoController;
	
	@BeforeEach
	public void setup() {
		
		Mockito
		.when(this.topoService.getCity(Mockito.anyString()))
		.thenReturn(new City("Tokyo", "Flat"));
		
		RestAssuredMockMvc.standaloneSetup(topoController);
	}
}
