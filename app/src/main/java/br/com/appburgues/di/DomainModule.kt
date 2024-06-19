package br.com.appburgues.di


import br.com.appburgues.data.repository.BurgerRepositoryImpl
import br.com.appburgues.domain.repository.BurgerRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun bindsBurguerRepositoryImpl (
        burgerRepositoryImpl: BurgerRepositoryImpl
    ) : BurgerRepository

}