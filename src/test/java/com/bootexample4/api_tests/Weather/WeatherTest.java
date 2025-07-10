
package com.bootexample4.api_tests.Weather;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
// import com.intuit.karate.http.HttpServer;
// import com.intuit.karate.http.ServerConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherTest {

	@Test
	void testAll() {
		String urlbase = System.getenv().get("URL_BASE");
		String key = System.getenv().get("KEY");
		Results results = Runner.path("src/test/java/com/bootexample4/api_tests/Weather")
			.systemProperty("URL_BASE", urlbase)
			.systemProperty("KEY", key)
			.reportDir("testReport")
			.parallel(1);
		assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}

}
