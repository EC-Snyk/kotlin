// WITH_RUNTIME

/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-591
 * MAIN LINK: declarations, classifier-declaration, data-class-declaration -> paragraph 2 -> sentence 12
 * NUMBER: 4
 * DESCRIPTION:  generated component function has the same type as this property and returns the value of this property
 */
open class B(open val a: Int, open val b: Any)
data class A(
    override val a: Int = 1,
    override val b: C = C(
        3.0,
        listOf(D(1, 1), D(2, 2))
    )
) : B(a, b)

class C(val c1: Double = 2.0, var c2: List<D>)
class D(val d1: Int, d2: Int)

fun box(): String {
    val x = A(2)

    if (x.component1() is Int
        && x.component2() is C
        && x.component1() == x.a
        && x.component1() == 2
        && x.component2() == x.b
    ) {
        return "OK"
    } else return "nok"
}


