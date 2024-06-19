package br.com.appburgues.data.mapper

import br.com.appburgues.data.model.BurgerResponse
import br.com.appburgues.data.model.ImageResponse
import br.com.appburgues.data.model.IngredientResponse
import br.com.appburgues.domain.model.Burger
import br.com.appburgues.domain.model.Image
import br.com.appburgues.domain.model.Ingredient

fun BurgerResponse.toDomain() = Burger(
    id = this.id,
    name = this.name,
    images = this.imageResponses?.map { it?.toDomain() },
    desc = this.desc,
    ingredients = this.ingredientsResponse?.map { it?.toDomain() },
)

fun ImageResponse.toDomain() = Image(
    sm = this.sm,
    lg = this.lg,
    desc = this.desc,
)

fun IngredientResponse.toDomain() = Ingredient(
    id = this.id,
    name = this.name,
    img = this.img,

)