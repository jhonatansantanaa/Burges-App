package br.com.appburgues.data.repository

import br.com.appburgues.data.model.BurgerResponse
import br.com.appburgues.domain.repository.BurgerRepository

class BurgerRepositoryImpl : BurgerRepository {

    override suspend fun getBurgers(): List<BurgerResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun getBurgerById(burgerId: Int): BurgerResponse {
        TODO("Not yet implemented")
    }

    override suspend fun updateBurgerByName(burgerName: String): List<BurgerResponse> {
        TODO("Not yet implemented")
    }
}