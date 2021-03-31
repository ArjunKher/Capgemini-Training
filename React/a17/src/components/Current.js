import React, {useState, useEffect} from 'react'
import axios from 'axios'


function Current() {
    const API_KEY = "b8c86a3ab03bca248e0101052e2ed75f"
    //api.openweathermap.org/data/2.5/weather?q=London&appid={API_key}
    const [weath, setWeath] = useState({
    })
    const [myObj, setMyObj] = useState("")
    useEffect(() => {
        axios.get(`http://api.openweathermap.org/data/2.5/weather?q=London&appid=${API_KEY}`)
        .then(res=>{
            console.log(res);
            setWeath(res.data)
           
        })
        .catch(err=>{
            console.log(err);
        })
    },[])

    return (
        <div className="dashBoard-Children">
            <div>
            <h3>Current weather display component</h3>
            </div>
            <div>
                <p>The current weather data</p>
                <h5>{JSON.stringify(weath.weather)}</h5>
                
            </div>
        </div>
    )
}

export default Current

