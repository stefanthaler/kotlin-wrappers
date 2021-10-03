// Automatically generated - do not modify!

@file:JsModule("@mui/material/StepContent")
@file:JsNonModule

package mui.material

external interface StepContentProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: StepContentClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The component used for the transition.
     * [Follow this guide](/components/transitions/#transitioncomponent-prop) to learn more about the requirements for this component.
     * @default Collapse
     */
    var TransitionComponent: react.ComponentType<TransitionProps>

    /**
     * Adjust the duration of the content expand transition.
     * Passed as a prop to the transition component.
     *
     * Set to 'auto' to automatically calculate transition time based on height.
     * @default 'auto'
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition) component.
     */
    var TransitionProps: TransitionProps
}

/**
 *
 * Demos:
 *
 * - [Steppers](https://mui.com/components/steppers/)
 *
 * API:
 *
 * - [StepContent API](https://mui.com/api/step-content/)
 */
@JsName("default")
external val StepContent: react.FC<StepContentProps>