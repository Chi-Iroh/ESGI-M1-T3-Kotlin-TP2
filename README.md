# Gestion de bibliothèque

## Lancer le projet

### Avec IntelliJ

Importer le projet, et démarrer.

### En ligne de commandes (Linux)

Prérequis: avoir installé les commandes `kotlinc` et `java`.  

```bash
kotlinc $(find src -name "*.kt") -include-runtime -d bibliotheque.jar && java -jar bibliotheque.jar
```

Ou, avec GNU Make :  
```bash
make run
```
