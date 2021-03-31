import React from 'react'

export const Hourly = (props) => {
    return (
        <div className="dashBoard-Children">
            <h3>Hourly weather display component</h3>
            {props.children}
        </div>
    )
}
