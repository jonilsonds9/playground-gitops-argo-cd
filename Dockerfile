FROM eclipse-temurin:21-jre-alpine

ARG APP_USER=app_user
RUN addgroup -S $APP_USER && adduser -S $APP_USER -G $APP_USER

ARG WAR_FILE=target/*.war
COPY --chown=$APP_USER:$APP_USER ${WAR_FILE} playground.war

USER $APP_USER
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "playground.war"]