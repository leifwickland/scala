/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2006-2011, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */


package scala.collection
package generic





abstract class OrderedTraversableFactory[CC[X] <: Traversable[X] with GenericOrderedTraversableTemplate[X, CC]]
extends GenericOrderedCompanion[CC] {

  class GenericCanBuildFrom[A](implicit ord: Ordering[A]) extends CanBuildFrom[CC[_], A, CC[A]] {
    def apply(from: CC[_]) = from.genericOrderedBuilder[A]
    def apply = newBuilder[A]
  }

}
