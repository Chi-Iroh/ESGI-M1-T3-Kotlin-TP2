interface Empruntable {
    // On ne peut pas rendre cet attribut privé car on est dans une interface
    // On ne peut pas non plus utiliser un companion object car il serait unique pour tous les objets empruntables
    // Donc on définit cet attribut public, pour ensuite le redéfinir en privé dans chaque classe empruntable
    var estEmprunte : Boolean

    fun emprunter(): Boolean  {
        // média déjà emprunté, on ne peut pas le réemprunter tant qu'il n'a pas été rendu
        if (estEmprunte) {
            return false
        }
        estEmprunte = true
        return true
    }

    fun retourner(): Boolean {
        // on ne peut rendre le média que s'il est actuellement emprunté
        if (estEmprunte) {
            estEmprunte = false
            return true
        }
        return false
    }
}
