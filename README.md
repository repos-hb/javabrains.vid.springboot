# workspace-springboot-javabrains
experimental codes for understanding springboot concept from tutorial (javabrains).

-- course-api-springdata-jpa
  
	.dependency.
		.groupId.org.springframework.boot./groupId.
		.artifactId.spring-boot-starter-data-jpa./artifactId.
	./dependency.
	.dependency.
		.groupId.org.springframework.boot./groupId.
		.artifactId.spring-boot-starter-web./artifactId.
	./dependency.

	.dependency.
		.groupId.org.apache.derby./groupId.
		.artifactId.derby./artifactId.
		.scope.runtime./scope.
	./dependency.
	.dependency.
		.groupId.org.springframework.boot./groupId.
		.artifactId.spring-boot-starter-test./artifactId.
		.scope.test./scope.
	./dependency.
	.!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-actuator --.
	.dependency.
		.groupId.org.springframework.boot./groupId.
		.artifactId.spring-boot-starter-actuator./artifactId.
	./dependency.

-- course-api

    .parent.
      .groupId.org.springframework.boot./groupId.
      .artifactId.spring-boot-starter-parent./artifactId.
      .version.2.1.3.RELEASE./version.
      .relativePath/. .!-- lookup parent from repository --.
	  ./parent.
	
		.dependency.
			.groupId.org.springframework.boot./groupId.
			.artifactId.spring-boot-starter-web./artifactId.
		./dependency.
