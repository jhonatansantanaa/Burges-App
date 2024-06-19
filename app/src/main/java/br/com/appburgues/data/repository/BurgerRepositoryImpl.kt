package br.com.appburgues.data.repository

import br.com.appburgues.data.api.ServiceAPI
import br.com.appburgues.data.model.BurgerResponse
import br.com.appburgues.domain.repository.BurgerRepository
import javax.inject.Inject

class BurgerRepositoryImpl @Inject constructor(
    private val serviceAPI: ServiceAPI
) : BurgerRepository {

    override suspend fun getBurgers(): List<BurgerResponse> {
        return serviceAPI.getBurgers()
    }

    override suspend fun getBurgerById(burgerId: Int): BurgerResponse {
       return serviceAPI.getBurgerById(burgerId)
    }

    override suspend fun getBurgerByName(name: String): List<BurgerResponse> {
       return serviceAPI.getBurgersByName(name)
    }
}