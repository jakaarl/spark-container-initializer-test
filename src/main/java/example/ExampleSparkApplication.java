package example;

import spark.Spark;
import spark.servlet.SparkApplication;

public class ExampleSparkApplication implements SparkApplication {

	@Override
	public void init() {
		Spark.get("/", (request, response) -> "Hello world!");
	}

}
