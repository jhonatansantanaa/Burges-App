package br.com.appburgues.data.model
data class BurgerResponse(
    val id: Int? = 0,
    val name: String? = "",
    val images: List<ImageResponse?>? = emptyList(),
    val desc: String? = "",
    val ingredients: List<IngredientResponse?>? = emptyList(),
    val price: Double? = 0.0,
    val veg: Boolean? = false
)
