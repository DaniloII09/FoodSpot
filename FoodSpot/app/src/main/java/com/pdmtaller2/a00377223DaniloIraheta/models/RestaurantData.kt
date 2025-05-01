package com.pdmtaller2.a00377223DaniloIraheta.models

val restaurants = listOf(
    Restaurant(
        id = 1,
        name = "Pizza Planet",
        description = "Las mejores pizzas del universo",
        imageUrl = "https://images.pexels.com/photos/2619967/pexels-photo-2619967.jpeg?auto=compress&cs=tinysrgb&h=350",
        categories = listOf("Pizzas", "Comida Italiana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 1,
                name = "Pizza Pepperoni",
                description = "Clásica pizza con pepperoni y queso.",
                imageUrl = "https://images.pexels.com/photos/159688/pizza-pepperoni-cheese-mozzarella-159688.jpeg?auto=compress&cs=tinysrgb&h=350"
            ),
            Dish(
                id = 2,
                name = "Pizza Vegetariana",
                description = "Pizza saludable con verduras frescas.",
                imageUrl = "https://images.pexels.com/photos/4109137/pexels-photo-4109137.jpeg?auto=compress&cs=tinysrgb&h=350"
            )
        )
    ),
    Restaurant(
        id = 2,
        name = "Burger King Kong",
        description = "Las hamburguesas más monstruosas",
        imageUrl = "https://images.pexels.com/photos/1639562/pexels-photo-1639562.jpeg?auto=compress&cs=tinysrgb&h=350",
        categories = listOf("Hamburguesas", "Comida Rápida", "Comida Americana", "Vegetariano"),
        menu = listOf(
            Dish(
                id = 3,
                name = "Hamburguesa Doble Queso",
                description = "Doble carne, doble queso, doble sabor.",
                imageUrl = "https://images.pexels.com/photos/1639562/pexels-photo-1639562.jpeg?auto=compress&cs=tinysrgb&h=350"
            ),
            Dish(
                id = 4,
                name = "Hamburguesa Vegana",
                description = "Una opción deliciosa y saludable.",
                imageUrl = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&h=350"
            )
        )
    ),
    Restaurant(
        id = 3,
        name = "Sushi Samurai",
        description = "El mejor sushi directo de Japón",
        imageUrl = "https://images.pexels.com/photos/357756/pexels-photo-357756.jpeg?auto=compress&cs=tinysrgb&h=350",
        categories = listOf("Sushi", "Comida Japonesa", "Mariscos"),
        menu = listOf(
            Dish(
                id = 5,
                name = "Sashimi de Salmón",
                description = "Finísimas láminas de salmón fresco.",
                imageUrl = "https://images.pexels.com/photos/2098085/pexels-photo-2098085.jpeg?auto=compress&cs=tinysrgb&h=350"
            ),
            Dish(
                id = 6,
                name = "Roll Dragón",
                description = "Roll con anguila, aguacate y salsa especial.",
                imageUrl = "https://images.pexels.com/photos/357743/pexels-photo-357743.jpeg?auto=compress&cs=tinysrgb&h=350"
            )
        )
    ),
    Restaurant(
        id = 4,
        name = "La Parrilla Argentina",
        description = "Auténtico sabor argentino a la parrilla",
        imageUrl = "https://images.pexels.com/photos/1143754/pexels-photo-1143754.jpeg?auto=compress&cs=tinysrgb&h=350",
        categories = listOf("Carnes", "Comida Argentina", "Parrillada"),
        menu = listOf(
            Dish(
                id = 7,
                name = "Bife de Chorizo",
                description = "Jugoso corte argentino a la parrilla.",
                imageUrl = "https://images.pexels.com/photos/1351238/pexels-photo-1351238.jpeg?auto=compress&cs=tinysrgb&h=350"
            ),
            Dish(
                id = 8,
                name = "Empanadas Criollas",
                description = "Empanadas rellenas de carne especiada.",
                imageUrl = "https://images.pexels.com/photos/1640777/pexels-photo-1640777.jpeg?auto=compress&cs=tinysrgb&h=350"
            )
        )
    )
)
