schedule: schedule-test
schedule-compile:
	javac -cp junit.jar -d . src/CNUScheduleMaker.java test/CNUScheduleMakerTest.java
schedule-test: schedule-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore CNUScheduleMakerTest

timeofday: timeofday-test
timeofday-compile:
	javac -cp junit.jar -d . src/TimeOfDay.java test/TimeOfDayTest.java
timeofday-test: timeofday-compile
	java -cp hamcrest.jar:junit.jar:. org.junit.runner.JUnitCore TimeOfDayTest

clean:
	rm *.class
