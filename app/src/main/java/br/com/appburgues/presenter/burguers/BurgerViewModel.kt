package br.com.appburgues.presenter.burguers

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import br.com.appburgues.data.response.ErrorResponse
import br.com.appburgues.domain.usecase.GetBurgersByNameUseCase
import br.com.appburgues.domain.usecase.GetBurgersUseCase
import br.com.appburgues.util.StateView
import br.com.appburgues.util.StateView.Error
import br.com.appburgues.util.getErrorResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import retrofit2.HttpException
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class BurgerViewModel @Inject constructor(
    private val getBurgersUseCase: GetBurgersUseCase,
    private val getBurgersByNameUseCase: GetBurgersByNameUseCase
) : ViewModel() {

    fun getBurgers() = liveData(Dispatchers.IO) {
        try {
            emit(StateView.Loading())

            val burgers = getBurgersUseCase

            emit(StateView.Success(burgers))

        } catch (e: HttpException) {
            val error = e.getErrorResponse<ErrorResponse>()
            emit(Error(e.message()))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(Error(e.message))
        }
    }

    fun getBurgerByName(name: String) = liveData(Dispatchers.IO) {
        try {
            emit(StateView.Loading())

            val burgers = getBurgersByNameUseCase(name)

            emit(StateView.Success(burgers))
        } catch (e: HttpException) {
            e.printStackTrace()
            val error = e.getErrorResponse<ErrorResponse>()
            emit(StateView.Error(e.message))
        } catch (e: Exception) {
            e.printStackTrace()
            emit(StateView.Error(e.message))
        }
    }
}