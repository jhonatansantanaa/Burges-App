package br.com.appburgues.data.model
data class BurgerResponse(
    val id: Int? = 0,
    val name: String? = "",
    val imageResponses: List<ImageResponse?>? = emptyList(),
    val desc: String? = "",
    val ingredientsResponse: List<IngredientResponse?>? = emptyList(),
    val price: Double? = 0.0,
    val veg: Boolean? = false
)
