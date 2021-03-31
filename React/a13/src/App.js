import './App.css';
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom'
import {Home} from './components/Home';
import {AddUser} from './components/AddUser';
import {EditUser} from './components/EditUser';
import {GlobalProvider} from './context/GlobalState'
import 'bootstrap/dist/css/bootstrap.min.css';

function App() {
  return (
    <div className="App">
      <GlobalProvider>
        <Router>
          <Switch>
            <Route path="/" exact component={Home}/>
            <Route path="/add" component={AddUser}/>
            <Route path="/edit" component={EditUser}/>
          </Switch>
        </Router>
      </GlobalProvider>
    </div>
  );
}

export default App;
