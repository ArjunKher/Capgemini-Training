import React, { Component } from 'react'

class TimeComponent extends Component {
    state = {time: new Date()}
    componentDidMount(){
        setInterval(() => {
            this.setState({
                time:new Date()
            })
        }, 1000);
    }
    componentWillUnmount(){
        clearInterval()
    }


    render() {
        return (
        <div>
            <p>{this.state.time.toLocaleTimeString()}</p>
        </div>
        );
    }
}
export default TimeComponent
