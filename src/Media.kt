// Le titre et la date de parution étant figés (avec val), on les rend publics pour être utilisés en dehors des classes (dans main par exemple)
// Ce ne sont pas des données critiques donc c'est acceptable de les exposer
// On n'a pas besoin d'ajouter "private set", car on a utilisé val
abstract class Media(public val titre: String, public val dateDeParution: String) {
    abstract fun afficher(): Unit
}
