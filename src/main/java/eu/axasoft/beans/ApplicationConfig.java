package eu.axasoft.beans;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.faces.annotation.FacesConfig;
import jakarta.inject.Named;
import jakarta.security.enterprise.authentication.mechanism.http.CustomFormAuthenticationMechanismDefinition;
import jakarta.security.enterprise.authentication.mechanism.http.LoginToContinue;


@CustomFormAuthenticationMechanismDefinition(
        loginToContinue = @LoginToContinue(
                loginPage = "/index.xhtml",
                errorPage = "/login-failed.xhtml",
                useForwardToLogin = false
        )
)

@FacesConfig
@Named(value = "applicationConfig")
@ApplicationScoped
public class ApplicationConfig {
    
}

