package com.example.a22698.actividad4

import com.example.a22698.R

class MercadoviewModel {

    fun traercategorias(): List<Mercado_model> {
        val categoriaslist = mutableListOf<Mercado_model>()

        categoriaslist.add(
            Mercado_model("ACCESORIOS PARA BELLEZA", R.drawable.foto_joven, "belleza")
        )
        categoriaslist.add(Mercado_model("PARA DEPORTES", R.drawable.foto_anciano, "deportes"))
        categoriaslist.add(
            Mercado_model(
                "TU NUEVO ELECTRODOMÉSTICO",
                R.drawable.ic_launcher_foreground,
                "electrodomesticos"
            )
        )
        categoriaslist.add(Mercado_model("PARA TU COLECCIÓN", R.drawable.ic_launcher_background, "juguetes"))
        categoriaslist.add(Mercado_model("PARA TU PERRHIJO", R.drawable.baseline_cruelty_free, "mascotas"))
        return categoriaslist
    }

    fun traerProductosPorCategoria(clave: String): List<ProductoMercado> {
        return when (clave) {
            "belleza" -> listOf(
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Perfume Nautica Voyage 100 ml — envase original",
                    "$ 899",
                    "Llega gratis mañana",
                    true,
                    "25% OFF"
                ),
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Protector solar La Roche-Posay Anthelios SPF 50+",
                    "$ 549",
                    "Envío $ 59",
                    false,
                    null
                ),
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Labial NYX Fat Oil lip drip — tono rojo",
                    "$ 189",
                    "Llega gratis en 2 días",
                    true,
                    "10% OFF"
                ),
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Set brochas maquillaje profesional 12 pzas",
                    "$ 320",
                    "Llega gratis mañana",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Crema hidratante facial uso diario 50 g",
                    "$ 275",
                    "Envío $ 49",
                    false,
                    "5% OFF"
                )
            )

            "deportes" -> listOf(
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Bicicleta de montaña rodado 26\" aluminio",
                    "$ 6,500",
                    "Llega gratis mañana",
                    true,
                    "35% OFF"
                ),
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Casco urbano ajustable talla M",
                    "$ 450",
                    "Llega gratis en 48 h",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Botella térmica deportiva 750 ml",
                    "$ 199",
                    "Envío $ 79",
                    false,
                    "12% OFF"
                ),
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Guantes de ciclismo con gel antideslizante",
                    "$ 165",
                    "Llega gratis mañana",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Carpa camping 4 personas impermeable",
                    "$ 2,890",
                    "Envío $ 120",
                    false,
                    "8% OFF"
                )
            )

            "electrodomesticos" -> listOf(
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Licuadora Ninja 1000 W vaso de vidrio",
                    "$ 1,890",
                    "Llega gratis mañana",
                    true,
                    "30% OFF"
                ),
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Microondas Mirage 0.9 pies cúbicos",
                    "$ 1,450",
                    "Llega gratis en 2 días",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Batidora de mano 5 velocidades",
                    "$ 399",
                    "Envío $ 99",
                    false,
                    "15% OFF"
                ),
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Sandwichera grill antiadherente",
                    "$ 520",
                    "Llega gratis mañana",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Cafetera de goteo programable 12 tazas",
                    "$ 680",
                    "Envío $ 79",
                    false,
                    "MSI 15 meses"
                )
            )

            "juguetes" -> listOf(
                ProductoMercado(
                    R.drawable.ic_launcher_background,
                    "Monopoly Pokémon — juego de mesa",
                    "$ 649",
                    "Llega gratis mañana",
                    true,
                    "45% OFF"
                ),
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Set LEGO orquídea decorativa para armar",
                    "$ 890",
                    "Llega gratis en 48 h",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Scooter eléctrico infantil con asiento",
                    "$ 3,200",
                    "Envío $ 150",
                    false,
                    "18% OFF"
                ),
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Pelota de fútbol #5 cosida a máquina",
                    "$ 280",
                    "Llega gratis mañana",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Rompecabezas 1000 piezas paisaje",
                    "$ 195",
                    "Envío $ 59",
                    false,
                    "7% OFF"
                )
            )

            "mascotas" -> listOf(
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Alimento Ganador adulto razas pequeñas 20 kg",
                    "$ 1,150",
                    "Llega gratis mañana",
                    true,
                    "30% OFF"
                ),
                ProductoMercado(
                    R.drawable.ic_launcher_foreground,
                    "Rascador para gato 3 niveles con juguete",
                    "$ 780",
                    "Llega gratis en 2 días",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.baseline_cruelty_free,
                    "Chaleco acolchado para perro talla M",
                    "$ 245",
                    "Envío $ 69",
                    false,
                    "12% OFF"
                ),
                ProductoMercado(
                    R.drawable.foto_joven,
                    "Correa retráctil 5 m con bloqueo",
                    "$ 189",
                    "Llega gratis mañana",
                    true,
                    null
                ),
                ProductoMercado(
                    R.drawable.foto_anciano,
                    "Arenero cerrado para gato con filtro",
                    "$ 920",
                    "Envío $ 99",
                    false,
                    "9% OFF"
                )
            )

            else -> emptyList()
        }
    }
}
