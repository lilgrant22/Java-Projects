albumtest: albumtest-test
albumtest-compile:
	javac -cp junit.jar -d . src/Album.java test/AlbumTest.java
albumtest-test: albumtest-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore AlbumTest

movietest: movietest-test
movietest-compile:
	javac -cp junit.jar -d . src/Movie.java test/MovieTest.java
movietest-test: movietest-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore MovieTest

stringformatting: stringformatting-test
stringformatting-compile:
	javac -cp junit.jar -d . src/StringFormatting.java test/StringFormattingTest.java
stringformatting-test: stringformatting-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore StringFormattingTest

shapetest: shapetest-test
shapetest-compile:
	javac -cp junit.jar -d . src/Shape.java src/Circle.java src/Rectangle.java src/Square.java test/ShapeTest.java
shapetest-test: shapetest-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore ShapeTest

superhero: superhero-test
superhero-compile:
	javac -cp junit.jar -d . src/Mammal.java src/Person.java src/Dog.java src/SuperHero.java src/SuperPerson.java  src/SuperDog.java test/SuperHeroTest.java 
superhero-test: superhero-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore SuperHeroTest

clean:
	rm *.class
