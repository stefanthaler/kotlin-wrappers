// Automatically generated - do not modify!

package react.dom.events

import dom.Element

external interface TransitionEvent<out T : Element> : SyntheticEvent<T, NativeTransitionEvent> {
    val elapsedTime: Double
    val propertyName: String
    val pseudoElement: String
}
