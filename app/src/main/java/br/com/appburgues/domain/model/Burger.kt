package br.com.appburgues.domain.model

data class Burger(
    val id: Int? = 0,
    val name: String? = "",
    val images: List<Image?>? = emptyList(),
    val desc: String? = "",
    val ingredients: List<Ingredient?>? = emptyList(),
    val price: Double? = 0.0,
    val veg: Boolean? = false
)
