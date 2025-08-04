import React from 'react'
import { useState } from 'react'

export const Form = ({ addUser }) => {

    const [username, setUsername] = useState("");

    function onSubmit(e){
        e.preventDefault();
        addUser(username);
    }

  return (
    <form onSubmit={onSubmit}>
        <input type="text" placeholder='Name' value={username} onChange={e => setUsername(e.target.value)}/>
        <button type="submit">+</button>
    </form>
  )
}
