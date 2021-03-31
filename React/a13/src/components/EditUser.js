import React, {useContext, useState, useEffect} from 'react';
import {Form, FormGroup, Label, Button, Input} from 'reactstrap';
import {Link, useHistory} from 'react-router-dom';
import {GlobalContext} from '../context/GlobalState';

export const EditUser = (props) => {
    const { users, editUser} = useContext(GlobalContext);
    const history = useHistory();
    
    const currentUserId = props.match.params.id;

    useEffect(()=>{
        const userId = currentUserId;
        const selectedUser  = users.find(user=>user.id === Number(userId))
        setSelectedUser(selectedUser)
    },[currentUserId,users])

    const onSubmit = ()=>{
        const newUser={
            id:selectedUser.id,
            name:selectedUser.name,
            job:selectedUser.job
        }
        history.push("/");
    }
    const [selectedUser,setSelectedUser] = useState(
        {
            id:'',
            name:'',
            job:''
        });
    return (
        <div>
             <Form onSubmit={onSubmit}>
                <FormGroup>
                    <Label>Name</Label>
                    <Input type="text" value={selectedUser.name} onChange={(e)=>setSelectedUser({...selectedUser, name:e.target.name})}  placeholder="Name"/>
                </FormGroup>
                <FormGroup>
                    <Label>Job</Label>
                    <Input type="text" value={selectedUser.job} onChange={(e)=>setSelectedUser({...selectedUser, job:e.target.job})} placeholder="Job"/>
                </FormGroup>
                <Button type="submit">Update</Button>
                <Link to="/" className="btn btn-danger ml-2">Cancel</Link>
            </Form>
        </div>
    )
}
