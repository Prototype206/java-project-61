.PHONY: setup run-dist build
setup:
	chmod +x ./gradlew
	./gradlew clean installDist
run-dist:
	./build/install/app/bin/app
build:
	./gradlew build


# For windows
.PHONY: win-setup win-run-dist win-build
win-setup:
	.\gradlew clean installDist
win-run-dist:
	.\build\install\app\bin\app
win-build:
	.\gradlew build
