package com.previo7.previo7s.configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info =@Info(
                title = "ADA Swagger",
                version = "v1.0",
                contact = @Contact(
                        name = "Harrison Martinez",
                        email = "ada@mail.com",
                        url = "https://ada-school.org/"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.apache.org/licenses/LICENSE-2.0"
                ),
                termsOfService = "Terminos y servicios de ADA",
                description = "My first Swagger"
        ),
        servers = {
                @Server(
                url = "http://localhost:8080",
                description = "Local Environment"
                ),@Server(
                    url = "https://publish-api.onrender.com",
                    description = "Production Environment"
                )
        }
)
public class OpenAPISecurityConfiguration {}