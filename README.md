# spark-container-initializer-test

A minimal WAR project for testing the container initializer.
Simply run `mvn package` and drop the generated WAR into
a container's deployment directory. A GET request to "/"
(prefix with context path, probably based on WAR name) should
display "Hello world!".
