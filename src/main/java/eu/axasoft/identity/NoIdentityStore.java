package eu.axasoft.identity;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.security.enterprise.credential.UsernamePasswordCredential;
import jakarta.security.enterprise.identitystore.CredentialValidationResult;
import jakarta.security.enterprise.identitystore.IdentityStore;
import java.util.EnumSet;
import java.util.Set;

/**
 *
 * @author kralmatej
 */
@ApplicationScoped
public class NoIdentityStore implements IdentityStore {

    @Override
    public int priority() {
        return 70;
    }

    @Override
    public Set<ValidationType> validationTypes() {
        return EnumSet.of(ValidationType.VALIDATE, ValidationType.PROVIDE_GROUPS);
    }

    public CredentialValidationResult validate(UsernamePasswordCredential credential) {
        CredentialValidationResult result;
        result = new CredentialValidationResult(credential.getCaller(), Set.of("OK"));
        return result;
    }

}
