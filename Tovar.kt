// Основной класс Товар
open class Tovar(
    val Name: String,
    val Price: Double,
    val edIzm: String,
    val vidTovara: String,
    val colvo: Int
) {
    open fun Inf(): String {
        return "Товар: $Name, Цена: $Price, Единица измерения: $edIzm, Вид товара: $vidTovara, Количество: $colvo"
    }
}