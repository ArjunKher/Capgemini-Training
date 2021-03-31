import './App.css';
import Details from './components/DataTable'

function App() {
  return (
    <div className="App">
      <table>
        <thead>
          <tr>
            <th>
              Name
            </th>
            <th>
              Job
            </th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <Details name="Vunnam" job="CEO"/>
          </tr>
          <tr>
            <Details name="D and D" job="Directors"/>
          </tr>
          <tr>
            <Details name="MyQueen" job="Burn Down"/>
          </tr>
          <tr>
            <Details name="John" job="King in the North"/>
          </tr>
          <tr>
            <Details name="Robb" job="Best Swords Man on Earth"/>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default App;
