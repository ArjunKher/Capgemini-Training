import React, { Component } from 'react'
import DateComponent from './components/DateComponent';
import TimeComponent from './components/TimeComponent';

export default class App extends Component {
  state={
    toggle:false
  }
  toogleMe(){
    this.setState({
      toggle: ! this.state.toggle
    })
  }
  render() {
    let message
  if(this.state.toggle){
    message=<div><DateComponent/></div>
  }
  return (

    <div className="App">
      <button name="toogle" onClick={this.toogleMe.bind(this)}>Toggle</button>
      <TimeComponent/>
      {message}
    </div>
  );
  }
}
