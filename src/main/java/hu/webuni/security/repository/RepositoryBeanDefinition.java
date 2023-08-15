package hu.webuni.security.repository;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class RepositoryBeanDefinition implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(@NotNull AnnotationMetadata importingClassMetadata, @NotNull BeanDefinitionRegistry registry) {
        AutoConfigurationPackages.register(registry, AppUserRepository.class.getPackageName());
        AutoConfigurationPackages.register(registry, ResponsibilityAppUserRepository.class.getPackageName());
    }
}
