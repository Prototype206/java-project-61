
plugins{
	id("java")
	id("application")
	id("com.github.ben-manes.versions") version "0.53.0"
	id("pmd")
	id("checkstyle")
}


pmd{
	toolVersion = "7.18.0"
}

checkstyle{
	toolVersion="12.1.2"
}


group = "hexlet.code"
version = "1.0.0"

repositories{
	mavenCentral()
}

dependencies{
	implementation("org.apache.commons:commons-lang3:3.20.0")
}

application{
	mainClass = "hexlet.code.App"
}

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}
