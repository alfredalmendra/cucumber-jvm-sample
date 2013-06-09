#language: fr

Fonctionnalité: une liste de valeurs et un exemple de variabilisation

  Contexte:
    Etant donnée une liste de préconditions:
        | numéro | nom            | valeur |
        |      1 | précondition 1 |     12 |
        |      2 | précondition 2 |      8 |
        |      3 | précondition 3 |     16 |

  Scénario: la liste est actionnée 1 seule fois
    Lorsqu'on exécute 1 action
    Alors la valeur totale du résultat est 36

  Plan du scénario: la liste est actionnée plusieurs fois
    Lorsqu'on exécute <N> actions
    Alors la valeur totale du résultat est <valeur>
  Exemples:
    | N | valeur |
    | 1 |     36 |
    | 2 |     36 |
