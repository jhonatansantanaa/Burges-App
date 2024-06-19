package br.com.appburgues.domain.repository

import br.com.appburgues.data.model.BurgerResponse

interface BurgerRepository {

    suspend fun getBurgers(): List<BurgerResponse>

    suspend fun getBurgerById(burgerId: Int): BurgerResponse

    suspend fun updateBurgerByName(burgerName: String): List<BurgerResponse>

}