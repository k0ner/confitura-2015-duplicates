package duplicates

import duplicates.people.Person

object DuplicatesTestData {

  val listOfIntegers = Seq(1, 2, 3, 4, 1, 5, 2, 7)
  val listOfUniques = Seq(1, 2, 3, 4, 5, 6, 7)
  val listOfCharacters = Seq('a', 'b', 'c', 'd', 'e', 'a', 'a', 'c', 'f', 'b')
  val listOfStrings = Seq("a", "b", "c", "d", "e", "a", "a", "c", "f", "b")
  val singleton = Seq(1)
}

object PeopleTestData {

  val John = Person("John", 21)
  val James = Person("James", 23)
  val Jane = Person("Jane", 33)
  val Hanna = Person("Hanna", 42)
  val Justin = Person("Justin", 16)

  val listOfPeople = Seq(John, John.copy(), John.copy(), James, Jane, Jane.copy(), Jane.copy(), Hanna, Justin, Justin.copy())
  val uniquePeople = Seq(John, James, Jane, Hanna, Justin)
}
