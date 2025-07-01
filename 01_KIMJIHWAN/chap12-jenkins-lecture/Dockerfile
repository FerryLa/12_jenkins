# OpenJDK 17 버전의 이미지를 가져와 JVM 환경을 구축한다.
FROM openjdk:17-alpine

# 현재 디렉토리 내의 모든 파일과 폴더를 컨테이너의 /app 디렉토리로 복사한다.
WORKDIR /app
COPY build/libs/*.jar app.jar

# app.jar를 리눅스 환경에서 실행하여 스프링 부트 서버를 시작한다.
ENTRYPOINT ["java", "-jar", "app.jar"]