all:
	javac src/*.java -d bin

clean:
	rm -fr bin/*.class
