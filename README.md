# Architecture_Logicielle

Ce projet a pour but d'analyser la structure d'un code source afin d'en générer un diagramme UML en format svg et en format textuel. Pour cela notre projet se décompose en trois grande partie: Extraction du code source, Analyse du code source, contruction d'un diagramme UML correspondant à la structure du code source. L'Extraction du code source se fait à l'aide d'un extractateur utilisant la classe URLClassLoader. 

Le code source est extrait au sein d'une classe Programme qui implémente une interface IProgramme. L'interface IProgramme contient une méthode `getAllClasses()` qui liste toutes les classes du code source. 

Pour chaque classe listée précedemment, on créé un objet Classe, qui a pour méthodes `getAllInterfaces()` qui liste toutes les interfaces du code source, `getAllClassesHeritees()` qui liste toutes les classes héritées, `getAllAttributs()` qui liste tous les attributs d'une classe, `getName()` qui retourn le nom de la classe et `getMethodes`qui retourne toutes les méthode de la classe.

La classe Attribut qui implémente l'interface IAttribut ayant pour méthodes `getType()` et `getName()`. La méthode `getType` retourne le type de l'attribut et la méthode `getNom` retourne le nom de l'attribut.

  



























