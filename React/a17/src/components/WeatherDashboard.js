import React, { Component } from 'react'

export default class WeatherDashboard extends Component {
    render() {
        return (
            <div className="dashBoard">
                <h2>Weather Dashboard</h2>
                <div>
                {this.props.children}
                </div>
            </div>
        )
    }
}
