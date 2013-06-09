#language: fr

Fonctionnalité: une liste de valeurs

  Scénario: 1 liste de valeurs
    Etant donnée une liste de préconditions:
        | numéro | nom            | valeur |
        |      1 | précondition 1 |     12 |
        |      2 | précondition 2 |      8 |
        |      3 | précondition 3 |     16 |
    Lorsqu'on exécute 1 action
    Alors la valeur totale du résultat est 36
