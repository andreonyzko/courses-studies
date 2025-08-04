import React from 'react'
import { useState } from 'react'

export const TaskList = () => {
    const [tasks, setTasks] = useState([]);
    const [taskInput, setTaskInput] = useState("");

    function submitHandle(e) {
        e.preventDefault();
        if(!taskInput.trim()) return;

        setTasks([...tasks, taskInput]);
        setTaskInput("");
    }

  return (
    <section>
        <form onSubmit={submitHandle}>
            <input type="text" placeholder='Task to do' value={taskInput} onChange={e => setTaskInput(e.target.value)}/>
            <button type="submit">+</button>
        </form>
        {tasks.length === 0 && <p>No tasks registered</p>}
        <ul> 
            {tasks.map((task, index) => (
                <li key={index}>{task}</li>
            ))}
        </ul>
    </section>
  )
}
