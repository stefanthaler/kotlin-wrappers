// Automatically generated - do not modify!

package react.dom.events

import dom.Element
import react.dom.AbstractView

external interface UIEvent<out T : Element, out E : NativeUIEvent> : SyntheticEvent<T, E> {
    val detail: Int
    val view: AbstractView
}
