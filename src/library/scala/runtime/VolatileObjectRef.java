/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2011, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */



package scala.runtime;


public class VolatileObjectRef<T> implements java.io.Serializable {
    private static final long serialVersionUID = -9055728157600312291L;

    volatile public T elem;
    public VolatileObjectRef(T elem) { this.elem = elem; }
    public String toString() { return String.valueOf(elem); }
}
