interface Empruntable {
    companion object {
        private var estEmprunte : Boolean = false;
    }

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
