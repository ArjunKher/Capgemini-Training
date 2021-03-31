import './App.css';
import Current from './components/Current';
import Header from './components/Header';
import { Hourly } from './components/Hourly';
import { HourlyForecastCard } from './components/HourlyForecastCard';
import WeatherDashboard from './components/WeatherDashboard';
import LayoutComp from './components/LayoutComp';

function App() {
  return (
      <LayoutComp>
      <div className="App">
        <Header/>
        <WeatherDashboard>
          <Current/>
          <Hourly>
            <HourlyForecastCard/>
          </Hourly>
          <Hourly>
            <HourlyForecastCard/>
          </Hourly>
        </WeatherDashboard>
      </div>
    </LayoutComp>
  );
}

export default App;
