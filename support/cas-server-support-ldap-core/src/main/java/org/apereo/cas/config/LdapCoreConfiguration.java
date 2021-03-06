package org.apereo.cas.config;

import org.apereo.cas.configuration.CasConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * This is {@link LdapCoreConfiguration}, reserved as a configuration class
 * to handle core ldap matters.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
@Configuration("ldapCoreConfiguration")
@EnableConfigurationProperties(CasConfigurationProperties.class)
public class LdapCoreConfiguration {
    
}
