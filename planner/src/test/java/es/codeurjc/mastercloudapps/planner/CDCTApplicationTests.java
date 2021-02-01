package es.codeurjc.mastercloudapps.planner;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties.StubsMode;
import org.springframework.web.client.RestTemplate;

import es.codeurjc.mastercloudapps.planner.models.LandscapeResponse;

@SpringBootTest
@AutoConfigureStubRunner(ids={"drojo2020:toposervice:+:stubs:8080"},
	stubsMode = StubsMode.LOCAL)
class CDCTApplicationTests {
	
	@Test
	void verify_topo_service() {
		RestTemplate restTemplate = new RestTemplate();

		LandscapeResponse landscapeResponse = restTemplate.getForObject(
				"http://localhost:8080/api/topographicdetails/Madrid",
				LandscapeResponse.class);

		assertEquals("Madrid", landscapeResponse.getId());
		assertEquals("Flat", landscapeResponse.getLandscape());
	}

}
