package br.com.appburgues.domain.usecase


import br.com.appburgues.data.mapper.toDomain
import br.com.appburgues.domain.model.Burger
import br.com.appburgues.domain.repository.BurgerRepository
import javax.inject.Inject

class GetBurgersUseCase @Inject constructor(
    private val burguerRepository: BurgerRepository
) {
    suspend operator fun invoke() : List<Burger> {
        return burguerRepository.getBurgers().map { it.toDomain() }
    }
}