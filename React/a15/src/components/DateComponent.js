import React, { Component } from 'react'

export default class DateComponent extends Component {
    state={
        date: new Date()
    }
    render() {
        return (
            <div>
                <p>{this.state.date.toLocaleDateString()}</p>
            </div>
        )
    }
}
