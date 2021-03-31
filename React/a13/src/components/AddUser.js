import React, {useContext, useState} from 'react';
import {Form, FormGroup, Label, Button, Input} from 'reactstrap';
import {Link, useHistory} from 'react-router-dom';
import {GlobalContext} from '../context/GlobalState';
import {v4 as uuid} from 'uuid';

export const AddUser = () => {
    const { addUser} = useContext(GlobalContext);
    const history = useHistory();
    const [name,setName] = useState('');
    const [job, setJob] = useState('');
    const onSubmit = ()=>{
        const newUser={
            id:uuid(),
            name,
            job
        }
        addUser(newUser);
        history.push("/");
    }
    return (
        
        <div>
            <Form onSubmit={onSubmit}>
                <FormGroup>
                    <Label>Name</Label>
                    <Input type="text" name="name" value={name} onChange={(e)=>{setName(e.target.value)}} placeholder="Name"/>
                </FormGroup>
                <FormGroup>
                    <Label>Job</Label>
                    <Input type="text" name="job" value={job} onChange={(e)=>{setJob(e.target.value)}} placeholder="Job"/>
                </FormGroup>
                <Button type="submit">Submit</Button>
                <Link to="/" className="btn btn-danger ml-2">Cancel</Link>
            </Form>
        </div>
    )
}
