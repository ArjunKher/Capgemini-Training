import './App.css';
import CalculatorBody from './components/CalculatorBody';
import {useState} from 'react'

function App() {
  const [result, setResult] = useState(0)
  
  return (
    <div className="App">
      <CalculatorBody/>
    </div>
  );
}

export default App;
