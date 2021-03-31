import React, {useState} from 'react'

function CalculatorBody() {
    const [data, setData] = useState('')
    const calcBtns=[];
    [9,8,7,6,5,4,3,2,1,0,"/","*","-","+"].forEach(element => {
        calcBtns.push(
            <button className="grid-item" onClick={e=>{setData(data+e.target.value)}} 
            value={element}
            key={element}>{element}</button>
        )
    });
    return (
        <div>
            <div>
                {data}
            </div>
            <div className="grid-container">
               {calcBtns}
            </div>
            <div>
                <button onClick={()=>setData(data.substr(0,data.length-1))}>CE</button>
            </div>
            <div>
                <button onClick={()=>setData("")}>AC</button>
            </div>
            <div>
            <button
          onClick={(e) => {
            try {
              setData(
                String(eval(data)).length > 3 &&
                  String(eval(data)).includes(".")
                  ? String(eval(data).toFixed(4))
                  : String(eval(data))
              );
            } catch (e) {
              console.log(e);
            }
          }}
          value="="
        >
          =
        </button>
            </div>
        </div>
    )
}

export default CalculatorBody