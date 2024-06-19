package br.com.appburgues.di

import br.com.appburgues.data.api.ServiceAPI
import br.com.appburgues.network.ServiceProvider
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DataModule {

    @Provides
    @Singleton
    fun providesServiceApi (
        serviceProvider: ServiceProvider
    ) : ServiceAPI {
        return serviceProvider.createService(ServiceAPI::class.java)
    }
}