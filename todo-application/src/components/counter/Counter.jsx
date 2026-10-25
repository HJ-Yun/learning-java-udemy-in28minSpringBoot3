import { useState } from 'react';
import {PropTypes} from "prop-types";

import './Counter.css'

export default function Counter() {
    const [totalCount, setTotalCount] = useState(0);

    function increaseCounterParentFunction(by){
        setTotalCount(totalCount + by)
    }

    function decreaseCounterParentFunction(by){
        setTotalCount(totalCount - by)
    }

    function resetCounterButton() {
        setTotalCount(0)
    }

    return(
        <div>
            <span className="totalCount">{totalCount}</span>
            <CounterButton
                by={1}
                increaseTotalCounter={increaseCounterParentFunction}
                decreaseTotalCounter={decreaseCounterParentFunction}/>
            <CounterButton
                by={2}
                increaseTotalCounter={increaseCounterParentFunction}
                decreaseTotalCounter={decreaseCounterParentFunction}/>
            <CounterButton
                by={5}
                increaseTotalCounter={increaseCounterParentFunction}
                decreaseTotalCounter={decreaseCounterParentFunction}/>
            <button className="resetCounterButton" onClick={resetCounterButton}>Reset</button>
        </div>
    )
}

function CounterButton({by, increaseTotalCounter, decreaseTotalCounter}) {

    const [count, setCount] = useState(0);

    console.log(by)

    function increaseButton(){
        setCount(count + by)
        increaseTotalCounter(by)
        console.log(count)
        console.log('increase')
    }

    function decreaseButton(){
        setCount(count - by)
        decreaseTotalCounter(by)
        console.log(count)
        console.log('decrease')
    }

    return(
        <div className="Counter">
            {/*<span className="count">{count}</span>*/}
            <div>
                <button className="counterButton" onClick={increaseButton}>+{by}</button>
                <button className="counterButton" onClick={decreaseButton}>-{by}</button>
            </div>
        </div>
    )
}

CounterButton.propTypes={
    by:PropTypes.number
}

CounterButton.defalutProps={
    by:1
}

