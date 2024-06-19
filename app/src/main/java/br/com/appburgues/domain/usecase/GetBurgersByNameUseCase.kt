package br.com.appburgues.domain.usecase

import br.com.appburgues.data.mapper.toDomain
import br.com.appburgues.domain.model.Burger
import br.com.appburgues.domain.repository.BurgerRepository
import javax.inject.Inject

class GetBurgersByNameUseCase @Inject constructor(
    private val burgerRepository: BurgerRepository
) {

    suspend operator fun invoke(name: String) : List<Burger> {
        return burgerRepository.getBurgerByName(name).map { it.toDomain() }
    }

}