import React, { Component } from "react";

class CounterComp extends Component {
  constructor() {
    super();
    this.state = {
      counter: 0,
    };
  }

  render() {
    return (
      <div>
        CounterComp
        <h1>Counter : {this.state.counter}</h1>
        <button type="button" onClick={ () => this.setState((prevState) => ({ counter: prevState.counter + 10 })) }>Increment</button>

        <button type="button" onClick={ () => this.setState((prevState) => ({ counter: prevState.counter - 10 })) }>Decrement</button>

        <button type="button" onClick={ () => this.setState((prevState) => ({ counter: 0 })) }>Reset</button>
      </div>
    );
  }
}
export default CounterComp;
