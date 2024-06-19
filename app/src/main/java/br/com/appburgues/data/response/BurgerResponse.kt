package br.com.appburgues.data.response
data class BurgerResponse(
    val id: Int? = 0,
    val name: String? = "",
    val imageResponses: List<ImageResponse?>? = emptyList(),
    val desc: String? = "",
    val ingredientsResponse: List<IngredientResponse?>? = emptyList(),
    val price: Float? = 0.0F,
    val veg: Boolean? = false
)
