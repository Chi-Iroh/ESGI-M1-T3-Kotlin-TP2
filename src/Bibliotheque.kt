class Bibliotheque {
    private var emprunts = mutableListOf<Media>()
    private var medias = mutableListOf<Media>()

    fun ajouterMedia(media: Media) {
        medias.add(media)
    }

    // Fonction générique car l'argument doit à la fois implémenter Empruntable et hériter de Media
    // car on appelle .emprunter() mais la liste des emprunts est une liste de Media
    fun <T> emprunter(media: T)
        where T : Media,
              T : Empruntable
    {
        if (media.emprunter()) {
            emprunts.add(media)
        } else {
            throw IllegalStateException("Le média '${media.titre}' n'est pas dans la bibliothèque, impossible de l'emprunter !")
        }
    }

    fun <T> retourner(media: T)
        where T : Media,
              T : Empruntable
    {
        if (media.retourner()) {
            emprunts.remove(media)
        } else {
            throw IllegalStateException("Le média '${media.titre}' n'a pas été emprunté au préalable, impossible de le rendre !")
        }
    }

    fun <T> consulter(media: T)
        where T : Media,
              T : Consultable
    {
        if (!medias.contains(media)) {
            throw IllegalStateException("Le média '${media.titre}' n'est pas dans la bibliothèque !")
        }
        media.consulter()
    }

    fun afficherEmprunts() {
        if (emprunts.isEmpty()) {
            println("Aucun emprunt en cours !")
            return
        }

        println("Emprunts en cours:")
        for (emprunt in emprunts) {
            print(" - ")
            emprunt.afficher()
        }
    }
}
