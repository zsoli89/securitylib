package hu.webuni.security.config;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import hu.webuni.security.repository.AppUserRepository;
import hu.webuni.security.repository.ResponsibilityAppUserRepository;

public class RepositoryBeanDefinition implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        AutoConfigurationPackages.register(registry, AppUserRepository.class.getPackageName());
        AutoConfigurationPackages.register(registry, ResponsibilityAppUserRepository.class.getPackageName());
    }
}
