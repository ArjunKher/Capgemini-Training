import React from 'react'

function LayoutComp(props) {
    return (
        <div  className={props.class}>
            {props.children}
        </div>
    )
}
export default LayoutComp
