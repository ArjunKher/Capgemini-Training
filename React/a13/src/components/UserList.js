import React, {useContext} from 'react';
import {Link} from 'react-router-dom';
import {ListGroup, ListGroupItem, Button} from 'reactstrap';
import {GlobalContext} from '../context/GlobalState'

export const UserList = () => {
    const {users, removeUser} = useContext(GlobalContext);
    return (
       <ListGroup className="mt-4">
           <div className="d-flex">
                <div className="ml-auto">
                    <h4>Name</h4>
                </div>
                <div className="ml-auto">
                    <h4>Job</h4>
                </div>
                <div className="ml-auto">
                    <h4>Action</h4>
                </div>
           </div>
           {users.map(user=>(
               <ListGroupItem key={user.id} className="d-flex">
                <div className="ml-auto">
                    {user.name}
                </div>
                <div className="ml-auto">
                    {user.job}
                </div>
                <div className="ml-auto">
                    <Link className="btn btn-warning mr-1" to={`/edit/${user.id}`}>Edit</Link>
                    <Button onClick={()=>{removeUser(user.id)}} color="danger">Delete</Button>
                </div>
               </ListGroupItem>
           ))}
           
       </ListGroup>
    )
}
