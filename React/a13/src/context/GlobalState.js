import React, {createContext, useReducer} from 'react';
import AppReducer from './AppReducer';

const initialState = {
    users:[
        {id:1, name:'User one', job: 'job'},
        {id:2, name:'User two', job: 'job2'},
        {id:3, name:'User three', job: 'job3'},
    ]
}

//create context
export const GlobalContext = createContext(initialState);

//provider content
export const GlobalProvider = ({children})=>{
    const [state, dispatch] = useReducer(AppReducer, initialState)
    const removeUser = (id)=>{
        dispatch({
            type:'REMOVE_USER',
            payload: id
        })
    }
    const addUser = (user)=>{
        dispatch({
            type:'ADD_USER',
            payload: user
        })
    }
    const editUser = (user)=>{
        dispatch({
            type:'EDIT_USER',
            payload: user
        })
    }
    return (
        <GlobalContext.Provider value={
            {
                users : state.users, 
                removeUser, 
                addUser,
                editUser
            }}>
            {children}
        </GlobalContext.Provider>
    )
}