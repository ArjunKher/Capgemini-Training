import React from 'react';
import ReactTable from "react-table";  

class EmpListTable extends React.Component{
    render(){
        const data= [{
            name:'Vunnam',
            job:'CEO'},
        {
            name:'Nobitha Neon',
            job:'Project Manager'},
        {
            name:'Doraemon',
            job:'Director'},
        {
            name:'Dekusaki',
            job:'Manager'},
        {
            name:'Shusuka',
            job:'Project Manager'}]
        const columns = [
            {Header:'Name', accessor:'name'},
            {Header:'Job',accessor:'job'}
        
        ] 
        return (
            <div>
                <ReactTable
                data={data}
                columns = {columns} 
                />
            </div>
        )
    }
}
export default EmpListTable